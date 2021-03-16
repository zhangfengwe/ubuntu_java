package com.fwzhang.second.entity.domain;

import com.fwzhang.second.entity.enumeration.LogLevelEnum;

/**
 * 日志内容
 */
public class LogContent {
    private LogLevelEnum logLevel;
    private String content;
    private String systemName;

    public LogContent() {
    }

    public LogContent(LogLevelEnum logLevel, String content, String systemName) {
        this.logLevel = logLevel;
        this.content = content;
        this.systemName = systemName;
    }

    public LogLevelEnum getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevelEnum logLevel) {
        this.logLevel = logLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
}
