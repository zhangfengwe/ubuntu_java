package com.fwzhang.third.collectionframework.collection;

import java.io.Serializable;
import java.util.*;

/**
 * @ClassName LinkedListClass
 * @Description
 * @Author fwzhang
 * @Date 2021/7/4
 * @Version 1.0
 **/

public class LinkedListClass<E> extends AbstractSequentialList<E>
        implements List<E>, Deque<E>, Cloneable, Serializable {

    /**
     * LinkedList实质为一个链表
     * 双向链表,没有循环,即最后一个元素的next没有指向第一个元素
     * 每一个节点都拥有一个指向前一个和后一个元素的指针
     */

    /**
     * LinkedList类用于存储数据的节点类
     *
     * @param <E>
     */
    private static class Node<E> {
        E item;
        // 指向前一个和后一个的指针
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    // LinkedList的属性
    transient int size = 0; // 容量
    transient Node<E> first; // 链表第一个元素
    transient Node<E> last; // 链表最后一个元素

    // 构造函数

    /**
     * LinkedList仅支持两种构造方式
     * 其中无参构造函数中没有任何操作,仅建立LinkedList对象,当前链表中无数据,size=0,first和last均为null
     * 含参构造函数,将Collection类型的数据转换为LinkedList类型
     */
    public LinkedListClass() { }
    public LinkedListClass(Collection<? extends E> c) {
        this();
        addAll(c);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }
}
