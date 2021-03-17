package com.fwzhang.test.second;

import com.fwzhang.second.dutychain.natived.FirstChainHandler;
import com.fwzhang.second.dutychain.natived.SecondChainHandler;
import com.fwzhang.second.entity.domain.MsgData;

public class NativedDutyChainTest {

    private static FirstChainHandler firstChainHandler;

    static {
        SecondChainHandler secondChainHandler = new SecondChainHandler();
        firstChainHandler = new FirstChainHandler(secondChainHandler);

    }

    public static void main(String[] args) {
        MsgData msgData = new MsgData();
        msgData.put("condition", "second");
        msgData.put("data", "second chain data");
        // 责任链起点开始执行
        firstChainHandler.handler(msgData);
    }
}
