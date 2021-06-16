package com.fwzhang.third.collectionframework.collection;

import java.util.*;

/**
 * @ClassName AbstractListClass
 * @Description
 * @Author fwzhang
 * @Date 2021/6/16
 * @Version 1.0
 **/

public class AbstractListClass<E> extends AbstractCollection<E> implements List<E> {
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

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
