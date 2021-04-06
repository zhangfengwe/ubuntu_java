package com.fwzhang.second.observe.natived;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteSubject
 * @Description
 * @Author fwzhang
 * @Date 2021/4/6
 * @Version 1.0
 **/

public class ConcreteSubject implements AbstractSubject<Observer> {

    private List<Observer> observerList;

    public ConcreteSubject() {
        observerList = new ArrayList<>();
    }

    public ConcreteSubject(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(observer -> {
            observer.update("change happened");
        });
    }
}
