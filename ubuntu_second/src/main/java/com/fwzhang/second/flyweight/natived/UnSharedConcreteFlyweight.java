package com.fwzhang.second.flyweight.natived;

/**
 * @ClassName UnSharedConcreteFlyweight
 * @Description
 * @Author fwzhang
 * @Date 2021/3/30
 * @Version 1.0
 **/

public class UnSharedConcreteFlyweight {

    private String info;

    public UnSharedConcreteFlyweight(){}

    public UnSharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
