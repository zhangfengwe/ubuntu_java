package com.fwzhang.second.decorator.natived;

public class ConcreteComponent implements Component {

    private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("具体构建信息, name: ".concat(this.name));
    }
}
