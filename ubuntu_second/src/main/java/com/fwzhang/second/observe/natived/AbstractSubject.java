package com.fwzhang.second.observe.natived;

/**
 * 被观察者
 */
public interface AbstractSubject<T extends Observer> {

    /**
     * 订阅观察者
     * @param observer
     */
    void addObserver(T observer);

    /**
     * 观察者取消订阅
     * @param observer
     */
    void removeObserver(T observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
