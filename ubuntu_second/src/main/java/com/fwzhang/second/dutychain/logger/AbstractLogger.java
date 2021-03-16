package com.fwzhang.second.dutychain.logger;

/**
 * 抽象日志打印类
 */
public abstract class AbstractLogger {

    // 日期 系统名 等级：内容
    private String logTemplate = "%s %s %s: %s";

    public abstract LogLevelEnum getLevel();

    public abstract void printLog(LogContent content);

    public String getLogTemplate() {
        return logTemplate;
    }
}
