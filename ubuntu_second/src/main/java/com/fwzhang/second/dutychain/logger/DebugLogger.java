package com.fwzhang.second.dutychain.logger;

import util.DateTimeUtil;

import java.time.Instant;
import java.util.Objects;

public class DebugLogger extends AbstractLogger {
    @Override
    public LogLevelEnum getLevel() {
        return LogLevelEnum.DEBUG;
    }

    @Override
    public void printLog(LogContent content) {
        if (Objects.equals(getLevel(), content.getLogLevel())) {
            System.out.println(String.format(getLogTemplate(),
                    DateTimeUtil.formatInstant(Instant.now(), DateTimeUtil.DATE_FORMAT),
                    content.getSystemName(), content.getLogLevel().name(), content.getContent()));

        }
    }
}
