package com.fwzhang.second.builder.natived;

import com.fwzhang.second.entity.domain.Bike;

/**
 * @ClassName BikeDirector
 * @Description 指挥者
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class BikeDirector {

    private AbstractBuilder builder;

    public BikeDirector(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Bike buildBike() {
        builder.buildBody();
        builder.buildHead();
        builder.buildName();
        return builder.construct();
    }
}
