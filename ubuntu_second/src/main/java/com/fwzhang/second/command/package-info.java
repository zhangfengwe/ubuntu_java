/**
 * 命令模式
 * 行为型模式
 * 请求以命令的形式包裹在对象中，传递给调用对象，调用对象接收到命令对象后，找到该命令真正的处理者，处理该命令
 * 角色：
 *      1、Command, 定义命令的接口
 *      2、concreteCommand, 命令接口的实现类，具体命令
 *      3、Receiver 接收者，真正执行命令的对象
 *      4、Invoker 真正触发命令并要求执行命令相应操作的地方
 *      5、Client 创建命令
 */
package com.fwzhang.second.command;