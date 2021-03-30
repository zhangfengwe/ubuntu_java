package com.fwzhang.second.flyweight.natived;

/**
 * @ClassName ConcreteFlyweight
 * @Description
 * @Author fwzhang
 * @Date 2021/3/30
 * @Version 1.0
 **/

public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("享元角色".concat(key).concat("被创建"));
    }

    @Override
    public void operation(UnSharedConcreteFlyweight state) {
        System.out.println("操作享元".concat(key).concat("对象"));
        System.out.println("外部状态信息".concat(state.getInfo()));
    }
}
