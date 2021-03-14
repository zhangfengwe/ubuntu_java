package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @ClassName DoubleTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/2/25
 * @Version 1.0
 **/

public class DoubleTypeHandler implements BaseTypeInterface<Double> {
    @Override
    public int byteLength() {
        return 8;
    }

    @Override
    public String typeDesc() {
        return "Double";
    }

    @Override
    public boolean supportCacheMaxMinValue() {
        return false;
    }

    @Override
    public Double maxCacheValue() {
        return null;
    }

    @Override
    public Double minCacheValue() {
        return null;
    }

    @Override
    public Double maxValue() {
        return Double.MAX_VALUE;
    }

    @Override
    public Double minValue() {
        return Double.MIN_VALUE;
    }

    @Override
    public Double defaultValue() {
        return 0.0;
    }

    @Override
    public Double stringConvertToType(String data) {
        // 官方源码的整体思路是将字符串遍历，转换为char数组
        // 将小数点的位置，整数部分，小数部分，正负标志分别存储
        // 转换为对应数值
        return Double.valueOf(data);
    }
}
