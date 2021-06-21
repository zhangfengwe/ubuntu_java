package com.fwzhang.third.collectionframework.collection.iterator;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 迭代器接口
 * @param <E>
 */
public interface IteratorInterface<E> {

    /**
     * 是否存在下一个迭代对象
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个迭代对象
     * @return
     */
    E next();

    /**
     * 迭代器默认不支持remove方法
     */
    default void remove() {
        throw new UnsupportedOperationException("Iterator default un support remove operation");
    }

    /**
     * 对迭代器中的每个元素执行相同操作
     * @param action
     */
    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}
