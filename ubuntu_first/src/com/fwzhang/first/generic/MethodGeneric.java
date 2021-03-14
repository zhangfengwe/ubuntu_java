package com.fwzhang.first.generic;

import java.util.Map;

/**
 * @ClassName MethodGeneric
 * @Description
 * @Author fwzhang
 * @Date 2021/3/13
 * @Version 1.0
 **/

public class MethodGeneric {

    public <T extends Map, H extends Map, R extends Map> R getGeneric(T a, H h) {
        a.putAll(h);
        R r = (R) a;
        return r;
    }

    /**
     * 范型方法中范型需要在方法前定义，使用<>包裹，多个范型类型在同一个<>中定义，使用逗号分隔
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public <T extends Number> T add(T a, T b) {
        return null;
    }

}
