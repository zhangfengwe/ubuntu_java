package com.fwzhang.third.collectionframework.collection;

import java.util.*;

/**
 * @ClassName AbstractListClass
 * @Description
 * @Author fwzhang
 * @Date 2021/6/16
 * @Version 1.0
 **/

public abstract class AbstractListClass<E> extends AbstractCollection<E> implements List<E> {

    /**
     * AbstractList继承了AbstractCollection抽象类
     * 集合框架中Abstract的抽象数据结构一般都不支持add操作, AbstractList同样不支持add操作
     * AbstractList是不可变的数据集合,所以对add,set,remove,removeRange(七拐八拐最终调用remove方法还是不支持)方法不支持
     */

    /**
     * 添加元素
     * @param e
     * @return
     */
    public boolean add(E e) {
        // 调用add(index, element)
        add(size(), e);
        return true;
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    /**
     * AbstractList中get为抽象方法，需要子类重写
     * @param index
     * @return
     */
    public abstract E get(int index);

    /**
     * AbstractList不支持set方法
     * @param index
     * @param element
     * @throws UnsupportedOperationException
     * @return
     */
    public E set(int index, E element) {
        throw new UnsupportedOperationException("AbstractList un support set operation");
    }

    /**
     * AbstractList类add方法的实际调用方法
     * 会抛出不支持该造作异常
     * @param index
     * @param element
     * @throws UnsupportedOperationException
     */
    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("AbstractList un support add operation");
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}