package com.vprivacy.message.controller;

import com.vprivacy.message.common.api.SendRequest;
import com.vprivacy.message.common.api.SendResponse;
import com.vprivacy.message.api.service.SendService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 消息发送接口
 * @Author: yxs
 * @Date: 2024/7/22 17:56
 */
@RestController
public class SendController {

    @Resource
    private SendService sendService;


    /**
     * 发送单条消息
     */
    @ApiOperation(value = "下发接口", notes = "多渠道多类型下发消息，目前支持邮件和短信，类型支持：验证码、通知类、营销类。")
    @PostMapping("/send")
    public SendResponse send(@RequestBody SendRequest sendRequest) {
        return sendService.send(sendRequest);
    }

}
