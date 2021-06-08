package com.fwzhang.third.collectionframework.collection;

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
}
