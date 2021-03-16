package com.fwzhang.first.datatype;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author fwzhang
 * @version 1.0
 * @ClassName BaseTypeInterface
 * @Description
 * @Date 2021/2/25
 **/

public interface BaseTypeInterface<T> extends TypeInterface{

    /**
     * T 为范型, 子类中需要使用基本类型的包装类
     */
    /**
     * 是否支持获取该类型最大值，最小值
     * @return
     */
    default boolean supportMaxMinValue() {
        return true;
    }

    default boolean supportCacheMaxMinValue() {
        return true;
    }

    /**
     * 类型字节长度
     * @return
     */
    int byteLength();

    /**
     * 类型描述
     * @return
     */
    String typeDesc();

    /**
     * 获取基本数据类型的最大值
     * @return
     */
    T maxValue();

    /**
     * 获取基本数据类型的最小值
     * @return
     */
    T minValue();

    /**
     * 静态缓存中的最大值
     * @return
     */
    T maxCacheValue();

    /**
     * 静态缓存中的最小值
     * @return
     */
    T minCacheValue();

    /**
     * 获取基本数据类型的默认值
     * @return
     */
    T defaultValue();

    /**
     * 将类型转换为字符串
     * @param data
     * @return
     */
    default String convertString(T data) {
        return String.valueOf(data);
    }

    /**
     * 将字符串类型数据转换为对象类型
     * @param data
     * @return
     */
    T stringConvertToType(String data);

    /**
     * 获取atomic对象
     * @return
     */
    default AtomicReference<T>  getAtomicReference(T data) {
        return new AtomicReference<>(data);
    }

    /**
     * 类型所占比特位长度
     * @return
     */
    default int bitLenth() {
        return byteLength() * Byte.SIZE;
    }

}
