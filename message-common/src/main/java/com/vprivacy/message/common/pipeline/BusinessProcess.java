package com.vprivacy.message.common.pipeline;

/**
 * @Description: 业务执行器
 * @Author: yxs
 * @Date: 2024/7/23 18:21
 */
public interface BusinessProcess<T extends ProcessModel> {

    /**
     * 真正处理逻辑
     *
     * @param context
     */
    void process(ProcessContext<T> context);
}
