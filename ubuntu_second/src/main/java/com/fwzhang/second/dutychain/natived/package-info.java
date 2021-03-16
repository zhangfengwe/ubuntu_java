/**
 * 原生责任链模式
 */
package com.fwzhang.second.dutychain.natived;

/**
 * 责任链组成：
 *      1、抽象处理者，一般为接口或抽象类，定义具体处理者的行为
 *      2、具体处理者， 抽象处理类的的子类或实现类，一般包括
 *          1、是否处理该请求的判断
 *          2、处理请求的具体逻辑
 *          3、责任链上下一个处理器的引用
 */