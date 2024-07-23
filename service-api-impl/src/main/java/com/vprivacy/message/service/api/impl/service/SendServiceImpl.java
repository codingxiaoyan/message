package com.vprivacy.message.service.api.impl.service;

import com.vprivacy.message.api.service.SendService;
import com.vprivacy.message.common.api.RespStatusEnum;
import com.vprivacy.message.common.api.SendRequest;
import com.vprivacy.message.common.api.SendResponse;
import com.vprivacy.message.common.domain.SimpleTaskInfo;
import com.vprivacy.message.common.pipeline.ProcessContext;
import com.vprivacy.message.common.pipeline.ProcessController;
import com.vprivacy.message.common.vo.BasicResultVO;
import com.vprivacy.message.service.api.impl.domain.SendTaskModel;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @Description: new java files header..
 * @Author: yxs
 * @Date: 2024/7/23 16:57
 */
@Service
public class SendServiceImpl implements SendService {

    @Resource
    @Qualifier("apiProcessController")
    private ProcessController processController;

    @Override
    public SendResponse send(SendRequest sendRequest) {
        // 检查参数
        if (ObjectUtils.isEmpty(sendRequest)) {
            return new SendResponse(RespStatusEnum.CLIENT_BAD_PARAMETERS.getCode(), RespStatusEnum.CLIENT_BAD_PARAMETERS.getMsg(), null);
        }

        SendTaskModel sendTaskModel = SendTaskModel.builder()
                .messageTemplateId(sendRequest.getMessageTemplateId())
                .messageParamList(Collections.singletonList(sendRequest.getMessageParam()))
                .build();

        ProcessContext context = ProcessContext.builder()
                .code(sendRequest.getCode())
                .processModel(sendTaskModel)
                .needBreak(false)
                .response(BasicResultVO.success()).build();

        ProcessContext<?> process = processController.process(context);
        BasicResultVO response = process.getResponse();
        return new SendResponse(process.getResponse().getStatus(), process.getResponse().getMsg(), (List<SimpleTaskInfo>) response.getData());
    }
}
