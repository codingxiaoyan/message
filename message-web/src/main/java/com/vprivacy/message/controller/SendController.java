package com.vprivacy.message.controller;

import com.vprivacy.message.api.SendRequest;
import com.vprivacy.message.api.SendResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 消息发送接口
 * @Author: yxs
 * @Date: 2024/7/22 17:56
 */
@RestController
public class SendController {


    @PostMapping("/send")
    public SendResponse send(@RequestBody SendRequest sendRequest) {
        return null;
    }

}
