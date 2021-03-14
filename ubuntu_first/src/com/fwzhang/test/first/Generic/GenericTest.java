package com.fwzhang.test.first.Generic;

import com.fwzhang.first.generic.ClassGeneric;

/**
 * @ClassName GenericTest
 * @Description
 * @Author fwzhang
 * @Date 2021/3/14
 * @Version 1.0
 **/

public class GenericTest {

    /**
     * 范型的使用多是在设计模式中使用
     * 继承，实现，多态在设计模式中使用较多，设计模式需要重点学习
     */

    public static void main(String[] args) {
        ClassGeneric<String> classGeneric = new ClassGeneric<>();
        classGeneric.setParam("123");
        System.out.println(classGeneric.getParam());
    }

}
