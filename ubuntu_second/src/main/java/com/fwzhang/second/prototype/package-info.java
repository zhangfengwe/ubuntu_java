/**
 * 原型模式
 * 属于创建型模式，用于创建重复的对象，有能够保证性能
 * 原型模式主要运用为clone，通过clone避免new操作
 * 1、浅克隆
 *      只复制他本身及其值类型的成员变量的值，引用类型的成员变量没有复制，这样的话一旦引用类型的成员变量的值发生改变
 *      所有复制得到的对象的对应的成员变量的值都会发生改变。
 * 2、深克隆
 *      对象本身和成员变量的值都复制到了。
 *      要想实现深克隆，需要实现序列化接口
 */
package com.fwzhang.second.prototype;