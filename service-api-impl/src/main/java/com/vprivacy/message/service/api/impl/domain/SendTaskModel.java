package com.vprivacy.message.service.api.impl.domain;

import com.vprivacy.message.common.api.MessageParam;
import com.vprivacy.message.common.domain.TaskInfo;
import com.vprivacy.message.common.pipeline.ProcessModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: new java files header..
 * @Author: yxs
 * @Date: 2024/7/23 17:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendTaskModel implements ProcessModel {

    /**
     * 消息模板Id
     */
    private Long messageTemplateId;

    /**
     * 请求参数
     */
    private List<MessageParam> messageParamList;

    /**
     * 发送任务的信息
     */
    private List<TaskInfo> taskInfo;


}
