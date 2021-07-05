package com.fwzhang.third.collectionframework.collection;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/**
 * ArrayList最常用的list类型
 * 通过数组存储数据, 支持对list中数据的增加，修改和删除
 * 继承了AbstractList, 实现了List接口
 * 同时实现了几个标记接口（仅用于标注可以实现某些功能）
 * @param <E>
 * Java中标记接口
 * RandomAccess 随机获取
 * Serializable 允许序列化
 * Cloneable 允许克隆
 */
public class ArrayListClass<E> extends AbstractList<E> implements List<E>, RandomAccess, Serializable, Cloneable {

    /**
     * ArrayList通过数组存储数据，elementData属性是ArrayList存储数据的属性
     * 数组的默认容量是10
     */
    transient Object[] elementData;

    private int size;
    /**
     * 默认容量
     * 如果没有指定容量，后续在数组扩容时，会根据这个字段进行判断
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};

    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
     * first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * 数组预留了头部信息位
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    // 扩容的相关方法

    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }
    /**
     * List扩容
     * @param minCapacity the desired minimum capacity
     */
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        // 新容量是现有容量的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 如果新容量仍小于需要的最小容量，则以需要的最小容量为准（用于addAll方法）
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        // 判断新的容量是否大于规定的最大容量
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        // 新的容量确定后，将原有数据复制到新数组中
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        // add后所需要的最小容量是否大于规定的数组最大容量
        // 如果大于，就取Integer的最大值，否则取规定的数组最大容量
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    public void add(int index, E element) {
        // 判断index参数是否合理(index >= 0 && index <= size)
        // rangeCheckForAdd(index);

        ensureCapacityInternal(size + 1);  // Increments modCount!!
        // 下面两行代码高效实现了在数组某个位置插入一个数据
        // 第一句 将目标位置后的数据后移一位，前提是数组已经扩容
        // 第二句 设置目标位置的值
        System.arraycopy(elementData, index, elementData, index + 1,
                size - index);
        elementData[index] = element;
        size++;
    }


    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    /**
     * indexOf,lastIndexOf 通过遍历数组获取索引
     * 没有使用迭代器
     * @param o
     * @return
     */
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size-1; i >= 0; i--)
                if (elementData[i]==null)
                    return i;
        } else {
            for (int i = size-1; i >= 0; i--)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }
}
