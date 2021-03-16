package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @ClassName FloatTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/2/25
 * @Version 1.0
 **/

public class FloatTypeHandler implements BaseTypeInterface<Float> {
    @Override
    public int byteLength() {
        return 4;
    }

    @Override
    public String typeDesc() {
        return "Float";
    }

    @Override
    public Float maxValue() {
        return Float.MAX_VALUE;
    }

    @Override
    public Float minValue() {
        return Float.MIN_VALUE;
    }

    @Override
    public Float defaultValue() {
        return 0f;
    }

    @Override
    public Float stringConvertToType(String data) {
        // 转换思路与Double一致，使用相同的方法将字符串分解
        // 最后获取与类型相对应的值
        return Float.valueOf(data);
    }

    @Override
    public boolean supportCacheMaxMinValue() {
        return false;
    }

    @Override
    public Float maxCacheValue() {
        return null;
    }

    @Override
    public Float minCacheValue() {
        return null;
    }
}
