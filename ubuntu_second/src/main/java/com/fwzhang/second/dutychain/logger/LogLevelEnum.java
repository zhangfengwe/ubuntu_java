package com.fwzhang.second.dutychain.logger;

/**
 * 日志登记枚举类
 */
public enum LogLevelEnum {

    ERROR(1),
    INFO(3),
    DEBUG(5);

    int sorted;

    LogLevelEnum(int sorted) {
        this.sorted = sorted;
    }

    public int getSorted() {
        return sorted;
    }
}
