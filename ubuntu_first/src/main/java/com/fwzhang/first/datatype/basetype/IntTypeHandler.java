package com.fwzhang.first.datatype.basetype;

import com.fwzhang.first.datatype.BaseTypeInterface;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName IntTypeHandler
 * @Description
 * @author fwzhang
 * @Date 2021/2/25
 * @version 1.0
 **/

public class IntTypeHandler implements BaseTypeInterface<Integer> {

    @Override
    public int byteLength() {
        return 4;
    }

    @Override
    public String typeDesc() {
        return "Integer";
    }

    @Override
    public Integer maxValue() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Integer minValue() {
        return Integer.MIN_VALUE;
    }

    @Override
    public Integer defaultValue() {
        return 0;
    }

    @Override
    public Integer stringConvertToType(String data) {
        /*
            1、判断字符串是否符合int类型数值
                校验字符串是否为null
                判断了进制是否在合法范围内 2-36(进制范围存储在Character类中，后续需要使用)
            2、通过字符串的首个字符判断是否为负数
            3、循环获取每个字符，通过Character.digist()方法将字符转换为对应数值，如果不是数值，返回-1
                将获取的数值进一位，然后减去这一位的数值，循环直至结束
            4、最后根据第二步判断的正负数结果，负数返回循环结果，正数取反
            5、最后判断转换得到的值是否在缓存中，在缓存中就返回缓存中的结果，不在则新建对象
             TODO 循环过程中的数值界限判断不太理解
         */
        return Integer.valueOf(data);
    }

    @Override
    public Integer maxCacheValue() {
        return 127;
    }

    @Override
    public Integer minCacheValue() {
        return -128;
    }
}
