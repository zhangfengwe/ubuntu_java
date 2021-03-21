package com.fwzhang.second.prototype.natived;

import java.util.Objects;

/**
 * @ClassName PrototypeClick
 * @Description
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class PrototypeClick {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        System.out.println("1 " + prototype);
        try {
            for (int i = 0; i < 3; i++) {
                ConcretePrototype clonePrototype = (ConcretePrototype) prototype.clone();
                clonePrototype.setName(Objects.toString(i));
                clonePrototype.setAddress(Objects.toString(i ^ 2));
                System.out.println(clonePrototype);
            }
            System.out.println("2 " + prototype);
            for (int i = 0; i < 4; i++) {
                ConcretePrototype deepClone = (ConcretePrototype) prototype.deepClone();
                deepClone.setAddress(Objects.toString(i));
                deepClone.setName(Objects.toString(i ^ 3));
                System.out.println(deepClone);
            }
            System.out.println("3 " + prototype);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
