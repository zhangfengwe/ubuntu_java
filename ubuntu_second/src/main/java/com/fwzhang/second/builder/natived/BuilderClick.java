package com.fwzhang.second.builder.natived;

/**
 * @ClassName BuilderClick
 * @Description 客户端
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class BuilderClick {
    public static void main(String[] args) {
        BikeDirector ofoDirector = new BikeDirector(new OfoBikeBuilder());
        System.out.println(ofoDirector.buildBike());
        BikeDirector moDirector = new BikeDirector(new MoBikeBuilder());
        System.out.println(moDirector.buildBike());
    }
}
