package com.fwzhang.second.dutychain.natived;

import com.fwzhang.second.entity.domain.MsgData;

public class FirstChainHandler implements DutyChainHandler {

    private DutyChainHandler nextHandler;

    public FirstChainHandler(DutyChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean onHandler(String condition) {
        return false;
    }

    @Override
    public void process(MsgData msgData) {

    }

    @Override
    public DutyChainHandler nextHandler() {
        return this.nextHandler;
    }
}
