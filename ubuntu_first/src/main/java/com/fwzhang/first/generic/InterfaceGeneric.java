package com.fwzhang.first.generic;

/**
 * @ClassName InterfaceGeneric
 * @Description
 * @Author fwzhang
 * @Date 2021/3/13
 * @Version 1.0
 **/

public interface InterfaceGeneric<T> {
    /**
     * 范型接口的定义与范型类的定义一致，范型的具体代表可以在实现类中定义，也可以在实现类实例化时指定
     */

    T getData();

    void setData(T data);

    <S extends T> T transData(S subData);

}
