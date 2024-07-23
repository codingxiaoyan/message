package com.vprivacy.message.api.service;

import com.vprivacy.message.common.api.SendRequest;
import com.vprivacy.message.common.api.SendResponse;

/**
 * @Description: new java files header..
 * @Author: yxs
 * @Date: 2024/7/23 16:35
 */
public interface SendService {

    SendResponse send(SendRequest sendRequest);


}
