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

    // 链表相关操作方法

    /**
     * 将元素设置为链表的第一个元素
     * new Node<>(null, e, next) 创建链表第一个元素
     * new Node<>(prev, e, null) 创建链表最后一个元素
     *
     * @param e
     */
    private void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

    /**
     * 将元素设置为链表最后一个元素
     */
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    /**
     * 在一个非空节点前插入一个新节点
     * @param e
     * @param succ
     */
    void linkBefore(E e, Node<E> succ) {
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }

    /**
     * 将节点f之前的数据删除，将f之后的节点设置为链表的第一个节点
     * 一般 f 节点为当前链表的第一个节点
     * @param f
     * @return
     */
    private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }

    /**
     * 删除节点l后的所有节点，将l的前一个节点设置为链表最后一个节点
     */
    private E unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        modCount++;
        return element;
    }

    /**
     * 删除指定节点
     */
    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
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
