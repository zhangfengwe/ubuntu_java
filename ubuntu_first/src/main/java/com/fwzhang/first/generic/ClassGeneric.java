package com.fwzhang.first.generic;

/**
 * @ClassName ClassGeneric
 * @Description
 * @Author fwzhang
 * @Date 2021/3/13
 * @Version 1.0
 **/

public class ClassGeneric<T> {

    /**
     * 范型类中 在类名上定义范型，使用尖括号包裹，多个范型使用同一个尖括号包裹，使用逗号分隔
     */

    private T param;

    public T getParam() {
        return this.param;
    }

    public void setParam(T t) {
        this.param = t;
    }



}
