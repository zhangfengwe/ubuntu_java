/**
 * 观察者模式
 * 行为型模式
 * 多个对象之间存在一对多的关系，当一个对象的状态发生改变时，其他对象能够自动接收到该对象的改变状态
 * 角色：
 *  1、观察者，一对多中多的一端，接收被观察者的状态改变
 *  2、被观察者，一对多中一的一端, 被观察者持有观察者对象，被观察者发生改变时，通过自身持有的观察者的对象通知观察者
 *      观察者订阅的过程便是将自身对象交给被观察者持有
 */
package com.fwzhang.second.observe;