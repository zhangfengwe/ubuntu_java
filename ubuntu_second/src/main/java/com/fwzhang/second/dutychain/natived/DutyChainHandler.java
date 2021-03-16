package com.fwzhang.second.dutychain.natived;

import com.fwzhang.second.entity.domain.MsgData;

import java.util.Objects;

public interface DutyChainHandler {

    boolean onHandler(String condition);

    /**
     * 真正的业务处理逻辑
     * @param msgData
     */
    void process(MsgData msgData);

    default void handler(MsgData msgData) {
        String condition = Objects.toString(msgData.get("condition"), "");
        if (onHandler(condition)) {
            this.process(msgData);
        } else {
            this.nextHandler().handler(msgData);
        }
    }

    DutyChainHandler nextHandler();
}
