package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @ClassName CharTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/2/25
 * @Version 1.0
 **/

public class CharTypeHandler implements BaseTypeInterface<Character> {
    @Override
    public int byteLength() {
        return 2;
    }

    @Override
    public String typeDesc() {
        return "Char";
    }

    @Override
    public Character maxValue() {
        return Character.MAX_VALUE;
    }

    @Override
    public Character minValue() {
        return Character.MIN_VALUE;
    }

    @Override
    public Character defaultValue() {
        return null;
    }

    @Override
    public Character stringConvertToType(String data) {
        throw new IllegalArgumentException("字符串无法转换为char类型");
    }

    @Override
    public Character maxCacheValue() {
        return (char) 128;
    }

    @Override
    public Character minCacheValue() {
        return (char) 0;
    }
}
