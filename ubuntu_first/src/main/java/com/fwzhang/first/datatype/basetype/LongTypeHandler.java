package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @ClassName LongTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/2/25
 * @Version 1.0
 **/

public class LongTypeHandler implements BaseTypeInterface<Long> {
    @Override
    public int byteLength() {
        return 8;
    }

    @Override
    public String typeDesc() {
        return "Long";
    }

    @Override
    public Long maxValue() {
        return Long.MAX_VALUE;
    }

    @Override
    public Long minValue() {
        return Long.MIN_VALUE;
    }

    @Override
    public Long defaultValue() {
        return 0L;
    }

    @Override
    public Long stringConvertToType(String data) {
        // 与Integer类型的逻辑一样，只是数值的界限范围改变了
        return Long.valueOf(data);
    }

    @Override
    public Long maxCacheValue() {
        return 127L;
    }

    @Override
    public Long minCacheValue() {
        return -128L;
    }
}
