package com.fwzhang.third.collectionframework.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

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
     * AbstractCollection类中很多方法都会在方法内部调用这两个方法
     * 这就要求子类需要实现这两个抽象方法,从而实现对应的功能
     * @return
     */
    public abstract Iterator iterator();

    public abstract int size();

    /**
     * 判断集合是否为空
     * 使用到了size()
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * 添加元素,不支持该操作
     * @param o
     * @return
     */
    public boolean add(Object o) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public <E> boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c)
            if (add(e))
                modified = true;
        return modified;
    }

    /**
     * 判断集合中是否包含某个对象
     * 使用了iterator()方法
     * @param o
     * @return
     */
    public boolean contains(Object o) {
        Iterator it = iterator();
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return true;
        } else {
            while (it.hasNext())
                // 自定义对象
                // 如果需要特殊的判断逻辑,需要重写equals和hashcode方法
                if (o.equals(it.next()))
                    return true;
        }
        return false;
    }

    /**
     * 循环调用contains方法
     * @param c
     * @return
     */
    public boolean containsAll(Collection<?> c) {
        for (Object e : c)
            if (!contains(e))
                return false;
        return true;
    }

    /**
     * 移除集合内某个元素
     * 使用了iterator方法
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        Iterator it = iterator();
        if (o==null) {
            while (it.hasNext()) {
                if (it.next()==null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 使用iterator的remove方法
     * 删除指定集合中包含在本集合中的元素
     * @param c
     * @return
     */
    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    /**
     * 删除指定集合中不在本集合中的元素
     * 即保留共有的元素
     * 与removeAll方法相反
     * @param c
     * @return
     */
    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    /**
     * 清空集合
     */
    public void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /**
     * 集合String输出打印
     * @return
     */
    public String toString() {
        Iterator it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Object e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    /**
     * 将集合转换为数组
     * @return
     */
    public Object[] toArray() {
        // Estimate size of array; be prepared to see more or fewer elements
        // 首先以现有的size()创建数组
        Object[] r = new Object[size()];
        Iterator it = iterator();
        // 遍历数组，通过iterator的next遍历集合
        // 使用数据遍历，是为了防止在toArray过程中，集合元素增加，从而导致索引溢出
        for (int i = 0; i < r.length; i++) {
            if (! it.hasNext()) // fewer elements than expected
                // iterator与size()长度不一致，iterator长度较小时
                // 拷贝当前的数组返回
                return Arrays.copyOf(r, i);
            r[i] = it.next();
        }
        // 判断iterator的长度是否大于size，不大于返回数组r,大于就调用finnishToArray方法将剩余的元素收集进数组中
        return it.hasNext() ? finishToArray(r, it) : r;
    }

    public <T> T[] toArray(T[] a) {
        // Estimate size of array; be prepared to see more or fewer elements
        int size = size();
        T[] r = a.length >= size ? a :
                (T[])java.lang.reflect.Array
                        .newInstance(a.getClass().getComponentType(), size);
        Iterator it = iterator();

        for (int i = 0; i < r.length; i++) {
            if (! it.hasNext()) { // fewer elements than expected
                if (a == r) {
                    r[i] = null; // null-terminate
                } else if (a.length < i) {
                    return Arrays.copyOf(r, i);
                } else {
                    System.arraycopy(r, 0, a, 0, i);
                    if (a.length > i) {
                        a[i] = null;
                    }
                }
                return a;
            }
            r[i] = (T)it.next();
        }
        // more elements than expected
        return it.hasNext() ? finishToArray(r, it) : r;
    }

    // 最大数据长度
    // 数组作为一个对象，存在一个对象头信息，最大不超过8个字节
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 收集多余元素到数组中
     * @param r
     * @param it
     * @param <T>
     * @return
     */
    private static <T> T[] finishToArray(T[] r, Iterator<?> it) {
        int i = r.length;
        while (it.hasNext()) {
            int cap = r.length;
            if (i == cap) {
                // 数组长度扩展
                // newLength = old + old/2 + 1
                int newCap = cap + (cap >> 1) + 1;
                // overflow-conscious code
                if (newCap - MAX_ARRAY_SIZE > 0)
                    newCap = hugeCapacity(cap + 1);
                r = Arrays.copyOf(r, newCap);
            }
            r[i++] = (T)it.next();
        }
        // trim if overallocated
        return (i == r.length) ? r : Arrays.copyOf(r, i);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError
                    ("Required array size too large");
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }
}
