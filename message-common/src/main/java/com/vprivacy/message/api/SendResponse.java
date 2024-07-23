package com.vprivacy.message.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @Description: new java files header..
 * @Author: yxs
 * @Date: 2024/7/22 18:16
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class SendResponse {
    /**
     * 响应状态
     */
    private String code;
    /**
     * 响应编码
     */
    private String msg;

    /**
     * 实际发送任务列表
     */
//    private List<SimpleTaskInfo> data;

}
