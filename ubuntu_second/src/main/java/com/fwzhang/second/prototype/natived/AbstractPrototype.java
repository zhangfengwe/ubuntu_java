package com.fwzhang.second.prototype.natived;

import java.io.*;

/**
 * @ClassName AbstractPrototype
 * @Description
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class AbstractPrototype implements Serializable, Cloneable {

    /**
     * 深克隆
     * 使用流的方式进行深克隆
     * @return
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);){
            System.out.println("深克隆执行");
            oos.writeObject(this);
            try (ObjectInputStream objectInputStream = new ObjectInputStream(
                    new ByteArrayInputStream(byteArrayOutputStream.toByteArray()))) {
                return objectInputStream.readObject();
            }
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("浅克隆");
        return super.clone();
    }
}
