/**
 * 建造者模式
 * 属于创建型模式
 * 是将多个简单对象构建为复杂对象
 * 实例：java中StringBuilder
 * 角色：
 *      1、Product 最终生成的对象，产品
 *      2、Builder 建造者的基类，也可以是接口，抽象定义了产品的构建过程
 *      3、Director 指挥者，负责控制产品整个生产过程
 *      4、Builder的子类或实现类，负责具体产品的构建
 */
package com.fwzhang.second.builder;
