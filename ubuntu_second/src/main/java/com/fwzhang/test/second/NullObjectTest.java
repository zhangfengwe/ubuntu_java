package com.fwzhang.test.second;

import com.fwzhang.second.nullobject.natived.AbstractEntity;
import com.fwzhang.second.nullobject.natived.NullEntity;
import com.fwzhang.second.nullobject.natived.RealEntity;

import java.util.Objects;

/**
 * @ClassName NullObjectTest
 * @Description
 * @Author fwzhang
 * @Date 2021/4/7
 * @Version 1.0
 **/

public class NullObjectTest {

    public static void main(String[] args) {
        String property = "1234";
        AbstractEntity entity;
        if (property == null || Objects.equals("", property)) {
            entity = new NullEntity();
        } else {
            entity = new RealEntity(property);
        }
        entity.show();
    }
}
