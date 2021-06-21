package com.fwzhang.third.collectionframework.collection.iterator;

/**
 * @ClassName ListIteratorInterface
 * @Description
 * @Author fwzhang
 * @Date 2021/6/21
 * @Version 1.0
 **/

public interface ListIteratorInterface<E> {
    /**
     * ListIterator继承Iterator接口
     * 属于List集合的迭代器
     */

    // Query operation

    boolean hasNext();

    E next();

    /**
     * ListIterator新增
     * 是否存在前一个元素
     * @return
     */
    boolean hasPrevious();

    /**
     * 获取前一个元素
     * @return
     */
    E previous();

    /**
     * 下一个迭代元素的索引值
     * @return
     */
    int nextIndex();

    /**
     * 前一个迭代元素的索引值
     * @return
     */
    int previousIndex();

    // modify operation

    /**
     * ListIterator支持修改迭代器
     * 所以存在remove,add,set方法
     */

    void remove();

    void set(E e);

    void add(E e);
}
