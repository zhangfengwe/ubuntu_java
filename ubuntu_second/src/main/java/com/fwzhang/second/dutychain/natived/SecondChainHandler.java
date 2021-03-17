package com.fwzhang.second.dutychain.natived;

import com.fwzhang.second.entity.domain.MsgData;

import java.util.Objects;

public class SecondChainHandler implements DutyChainHandler {

    public SecondChainHandler() {
    }

    @Override
    public boolean onHandler(String condition) {
        return Objects.equals("second", condition);
    }
    /**
     * 真正的业务处理逻辑
     *
     * @param msgData
     */
    @Override
    public void process(MsgData msgData) {
        System.out.println(msgData.get("condition"));
        System.out.println(msgData.get("data"));
    }

    @Override
    public DutyChainHandler nextHandler() {
        return null;
    }
}
