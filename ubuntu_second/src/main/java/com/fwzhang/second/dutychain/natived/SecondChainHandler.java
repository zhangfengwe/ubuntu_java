package com.fwzhang.second.dutychain.natived;

import com.fwzhang.second.entity.domain.MsgData;

public class SecondChainHandler implements DutyChainHandler {
    @Override
    public boolean onHandler(String condition) {
        return false;
    }

    /**
     * 真正的业务处理逻辑
     *
     * @param msgData
     */
    @Override
    public void process(MsgData msgData) {

    }

    @Override
    public DutyChainHandler nextHandler() {
        return null;
    }
}
