package com.fwzhang.second.dutychain.natived;

import com.fwzhang.second.entity.domain.MsgData;

import java.util.Objects;

public class FirstChainHandler implements DutyChainHandler {

    private DutyChainHandler nextHandler;

    public FirstChainHandler() {
    }

    public FirstChainHandler(DutyChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean onHandler(String condition) {
        return Objects.equals("first", condition);
    }

    @Override
    public void process(MsgData msgData) {
        System.out.println(msgData.get("condition"));
        System.out.println(msgData.get("data"));
    }

    @Override
    public DutyChainHandler nextHandler() {
        return this.nextHandler;
    }
}
