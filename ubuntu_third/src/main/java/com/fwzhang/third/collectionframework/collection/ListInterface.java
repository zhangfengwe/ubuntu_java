package com.fwzhang.third.collectionframework.collection;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @ClassName LIstInterface
 * @Description
 * @Author fwzhang
 * @Date 2021/6/15
 * @Version 1.0
 **/

public interface ListInterface<E> extends Collection<E> {

    /**
     * List接口直接继承了Collection接口
     * 同时List接口是java中list类型数据结构的父类,应该是所有list类型的数据结构都是List接口的实现类
     * List定义了所有list数据类型的行为
     * List拥有所有Collection接口的方法
     */

    /**
     * 将集合C添加到当前集合中,不过是指定索引位置,即插入集合的开始索引位置
     * @param index
     * @param c
     * @return
     */
    boolean addAll(int index, Collection<? extends E> c);

    /**
     * 获取集合中指定索引位置的值
     * @param index
     * @throws IndexOutOfBoundsException
     * @return
     */
    E get(int index);

    /**
     * 在指定索引后添加值
     * @param index
     * @param element
     */
    void add(int index, E element);

    /**
     * 从集合中移除指定索引位置的元素,并返回该元素
     * @param index
     * @return
     */
    E remove(int index);

    /**
     * 获取某元素在集合中的索引位置,不存在一般返回-1
     * @param o
     * @return
     */
    int indexOf(Object o);

    /**
     * 与indexOf的查找顺序相反
     * indexOf 从左向右
     * lastIndexOf 从右向左
     * @param o
     * @return
     */
    int lastIndexOf(Object o);

    /**
     * 获取迭代器对象
     * 与iterator方法一致
     * iterator方法返回Iterator类型
     * ListIterator集成Iterator接口
     * @return
     */
    ListIterator<E> listIterator();

    /**
     * 截取集合
     * @param fromIndex
     * @param toIndex
     * @return
     */
    List<E> subList(int fromIndex, int toIndex);

    /**
     * 对集合进行排序
     * @param c
     */
    default void sort(Comparator<? super E> c) {
        Object[] a = this.toArray();
        Arrays.sort(a, (Comparator) c);
        ListIterator<E> i = this.listIterator();
        for (Object e : a) {
            i.next();
            i.set((E) e);
        }
    }

    /**
     * 对集合中每个元素执行相同的指定操作
     * @param operator
     */
    default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }
}
