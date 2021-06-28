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

    /**
     *
     * @param index
     * @throws UnsupportedOperationException
     * @return
     */
    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("AbstractList un support remove operation");
    }

    /**
     * 1、获取AbstractList的内部类ListIterator的实现类
     * 2、通过ListIterator的previousIndex方法获取元素的索引值
     * @param o
     * @return
     */
    @Override
    public int indexOf(Object o) {
        ListIterator<E> it = listIterator();
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return it.previousIndex();
        } else {
            while (it.hasNext())
                // 每次调用next或previous方法,迭代器的游标都会有相应的变化,加一或减一,并返回
                if (o.equals(it.next()))
                    return it.previousIndex();
        }
        return -1;
    }

    /**
     * 倒序寻找元素的索引值
     * @param o
     * @return
     */
    @Override
    public int lastIndexOf(Object o) {
        ListIterator<E> it = listIterator();
        if (o == null) {
            while (it.hasPrevious()) {
                if (it.previous() == null) {
                    return it.nextIndex();
                }
            }
        } else {
            while (it.hasPrevious()) {
                if (o.equals(it.previous())) {
                    return it.nextIndex();
                }
            }
        }
        return 0;
    }

    /**
     * listIterator()方法获取的是ListIterator接口的实现类对象
     * 支持对list中元素进行修改, 但是由于迭代器的add,set,remove方法本质上会调用
     * AbstractList本身的add,remove方法,所以实质上无法通过迭代器对AbstractList中的元素进行修改
     * @return
     */
    @Override
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        rangeCheckForAdd(0);
        return new ListItr(index);
    }

    /**
     * iterator()方法获取的是iterator接口的实现类对象
     * 所以不支持list中元素的修改,同时也不支持迭代器双向迭代
     * 仅支持next操作
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    protected transient int modCount = 0;

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size();
    }

    private class Itr implements Iterator<E> {
        /**
         * Index of element to be returned by subsequent call to next.
         */
        int cursor = 0;

        /**
         * Index of element returned by most recent call to next or
         * previous.  Reset to -1 if this element is deleted by a call
         * to remove.
         */
        int lastRet = -1;

        /**
         * The modCount value that the iterator believes that the backing
         * List should have.  If this expectation is violated, the iterator
         * has detected concurrent modification.
         */
        int expectedModCount = modCount;

        public boolean hasNext() {
            return cursor != size();
        }

        public E next() {
            checkForComodification();
            try {
                int i = cursor;
                E next = get(i);
                lastRet = i;
                cursor = i + 1;
                return next;
            } catch (IndexOutOfBoundsException e) {
                checkForComodification();
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try {
                AbstractListClass.this.remove(lastRet);
                if (lastRet < cursor)
                    cursor--;
                lastRet = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException e) {
                throw new ConcurrentModificationException();
            }
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    private class ListItr extends Itr implements ListIterator<E> {
        ListItr(int index) {
            cursor = index;
        }

        public boolean hasPrevious() {
            return cursor != 0;
        }

        public E previous() {
            checkForComodification();
            try {
                int i = cursor - 1;
                E previous = get(i);
                lastRet = cursor = i;
                return previous;
            } catch (IndexOutOfBoundsException e) {
                checkForComodification();
                throw new NoSuchElementException();
            }
        }

        public int nextIndex() {
            return cursor;
        }

        public int previousIndex() {
            return cursor-1;
        }

        public void set(E e) {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try {
                AbstractListClass.this.set(lastRet, e);
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        public void add(E e) {
            checkForComodification();

            try {
                int i = cursor;
                AbstractListClass.this.add(i, e);
                lastRet = -1;
                cursor = i + 1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
    }
}