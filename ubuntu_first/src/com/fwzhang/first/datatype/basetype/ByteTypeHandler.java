package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

/**
 * @author fwzhang
 * @version 1.0
 * @ClassName ByteTypeHandler
 * @Description
 * @Date 2021/2/25
 **/

public class ByteTypeHandler implements BaseTypeInterface<Byte> {
    @Override
    public int byteLength() {
        return 1;
    }

    @Override
    public String typeDesc() {
        return "Byte";
    }

    @Override
    public Byte maxValue() {
        return Byte.MAX_VALUE;
    }

    @Override
    public Byte minValue() {
        return Byte.MIN_VALUE;
    }

    @Override
    public Byte defaultValue() {
        return 0;
    }

    @Override
    public Byte stringConvertToType(String data) {
        /*
            1、首先将字符串转换为10进制（默认为10进制，存在选择进制的重写方法）的int类型数值，转换失败抛出NumberFormatException
            2、判断字符串转换得到的int类型的数值是否超出Byte类型的数值范围，超出抛出NumberFormatException
            3、将int类型的数值强转为byte类型
         */
        return Byte.valueOf(data);
    }

    @Override
    public Byte maxCacheValue() {
        return 127;
    }

    @Override
    public Byte minCacheValue() {
        return -128;
    }
}
