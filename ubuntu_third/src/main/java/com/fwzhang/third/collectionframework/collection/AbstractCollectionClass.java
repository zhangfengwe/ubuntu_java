package com.fwzhang.third.collectionframework.collection;

import java.util.Iterator;

/**
 * @ClassName AbstractCollectionClass
 * @Description
 * @Author fwzhang
 * @Date 2021/6/7
 * @Version 1.0
 **/

public abstract class AbstractCollectionClass {

    /**
     * AbstractCollection 抽象类,实现了Collection接口
     * 不存在真正存放集合数据的属性,所以不支持Add相关操作
     * 不支持add相关操作的包括很多抽象集合类
     */

    /**
     * 定义的抽象方法,要求子类需要实现这两个方法
     * @return
     */
    public abstract Iterator iterator();

    public abstract int size();

}
