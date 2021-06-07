package com.fwzhang.third.collectionframework.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ClassName Collection
 * @Description
 * @Author fwzhang
 * @Date 2021/5/23
 * @Version 1.0
 **/

public interface CollectionInterface extends Iterable<Object>{
    /**
     * Collection
     * java集合框架的顶层接口，与Map同级
     * 继承了Iterable接口（通用接口，标注该类是可以迭代的）
     * Collection接口中定义了集合的基本行为
     */
    int size();
    boolean isEmpty();
    boolean contains(Object o);

    /**
     * Returns an iterator over elements of type {@code T}.
     * 获取对应迭代器，JDK源码中迭代器一般以内部类形式存在，不提供给外部使用
     * @return an Iterator.
     */
    @Override
    Iterator<Object> iterator();

    /**
     * 将集合转换为数组
     * @return
     */
    Object[] toArray();

    /**
     *
     * @param o
     * @return
     */
    Object[] toArray(Object[] o);

    boolean add(Object e);

    boolean remove(Object e);

    boolean containsAll(Collection<?> collection);
    boolean addAll(Collection<? extends Object> collection);
    boolean removeAll(Collection<? extends Object> collection);

    boolean retainAll(Collection<?> collection);

    /**
     * 删除符合条件的项
     * @param filter
     * @return
     */
    default boolean removeIf(Predicate<Object> filter) {
        boolean removed = false;
        final Iterator<Object> each = iterator();
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }
        return removed;
    }

    /**
     * 获取Stream 1.8新增
     * 为所有Collection接口的实现类定义了获取流的方法
     * 通过default修饰符实现在接口中定义具体方法
     * @return
     */
    Stream<Object> stream();

    /**
     * stream()获取的是串行的流,线程安全
     * parallelStream()获取的是并行的流,流中定义的数据处理会并行执行
     * 通过ForkJoin(1.7提供)框架实现
     * @return
     */
    Stream<Object> parallelStream();
}
