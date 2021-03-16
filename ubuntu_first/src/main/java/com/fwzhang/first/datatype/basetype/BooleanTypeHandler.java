package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @ClassName BooleanTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/2/25
 * @Version 1.0
 **/

public class BooleanTypeHandler implements BaseTypeInterface<Boolean> {

    @Override
    public boolean supportMaxMinValue() {
        return false;
    }

    @Override
    public int byteLength() {
        return 0;
    }

    @Override
    public String typeDesc() {
        return "Boolean";
    }

    @Override
    public Boolean maxValue() {
        return null;
    }

    @Override
    public Boolean minValue() {
        return null;
    }

    @Override
    public Boolean maxCacheValue() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean minCacheValue() {
        return Boolean.FALSE;
    }

    @Override
    public Boolean defaultValue() {
        return false;
    }

    @Override
    public Boolean stringConvertToType(String data) {
        // 使用字符串数据和true进行比较
        // 相等返回true
        // 否则返回false
        return Boolean.valueOf(data);
    }
}
