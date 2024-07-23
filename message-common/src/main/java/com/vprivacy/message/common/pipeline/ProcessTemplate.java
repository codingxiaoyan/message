package com.vprivacy.message.common.pipeline;

import java.util.List;

/**
 * @Description: 业务执行模板（把责任链的逻辑串起来）
 * @Author: yxs
 * @Date: 2024/7/23 18:21
 */
public class ProcessTemplate {

    private List<BusinessProcess> processList;

    public List<BusinessProcess> getProcessList() {
        return processList;
    }

    public void setProcessList(List<BusinessProcess> processList) {
        this.processList = processList;
    }
}
