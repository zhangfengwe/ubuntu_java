package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @ClassName ShortTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/2/25
 * @Version 1.0
 **/

public class ShortTypeHandler implements BaseTypeInterface<Short> {
    @Override
    public int byteLength() {
        return 2;
    }

    @Override
    public String typeDesc() {
        return "Short";
    }

    @Override
    public Short maxValue() {
        return Short.MAX_VALUE;
    }

    @Override
    public Short minValue() {
        return Short.MIN_VALUE;
    }

    @Override
    public Short defaultValue() {
        return 0;
    }

    @Override
    public Short stringConvertToType(String data) {
        // short的转换算法与byte一致，只是数值范围不同
        return Short.valueOf(data);
    }

    @Override
    public Short maxCacheValue() {
        return 127;
    }

    @Override
    public Short minCacheValue() {
        return -128;
    }
}
