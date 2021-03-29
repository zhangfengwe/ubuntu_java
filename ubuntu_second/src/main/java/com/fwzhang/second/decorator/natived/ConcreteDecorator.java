package com.fwzhang.second.decorator.natived;

public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator() {
    }

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.println("装饰器:".concat(this.getClass().getSimpleName()));
        this.component.print();
    }
}
