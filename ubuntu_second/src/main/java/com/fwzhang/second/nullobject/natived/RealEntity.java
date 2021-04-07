package com.fwzhang.second.nullobject.natived;

/**
 * @ClassName RealEntity
 * @Description
 * @Author fwzhang
 * @Date 2021/4/7
 * @Version 1.0
 **/

public class RealEntity extends AbstractEntity {

    public RealEntity() {
    }

    public RealEntity(String property) {
        this.property = property;
    }

    @Override
    public void show() {
        System.out.println(this.property);
    }
}
