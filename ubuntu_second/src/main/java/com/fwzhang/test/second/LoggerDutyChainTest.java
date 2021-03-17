package com.fwzhang.test.second;

import com.fwzhang.second.dutychain.logger.AbstractLogger;
import com.fwzhang.second.dutychain.logger.DebugLogger;
import com.fwzhang.second.dutychain.logger.ErrorLogger;
import com.fwzhang.second.dutychain.logger.InfoLogger;

import java.util.ArrayList;
import java.util.List;

public class LoggerDutyChainTest {

    private static List<AbstractLogger> abstractLoggerList;

    static {
        abstractLoggerList = new ArrayList<>();
        abstractLoggerList.add(new DebugLogger());
        abstractLoggerList.add(new ErrorLogger());
        abstractLoggerList.add(new InfoLogger());
    }

    public static void main(String[] args) {
    }
}
