package com.fwzhang.second.prototype.natived;

/**
 * @ClassName ConcretePrototype
 * @Description
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class ConcretePrototype extends AbstractPrototype {

    private String name;

    private String address;

    public ConcretePrototype() {
        System.out.println("constructor execute");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", hashCode='" + this.hashCode() + "\'" +
                '}';
    }
}
