package com.fwzhang.test.second;

import com.fwzhang.second.decorator.natived.ConcreteComponent;
import com.fwzhang.second.decorator.natived.ConcreteDecorator;

public class DecoratorTest {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent("decoratorTest");
        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.print();
    }
}
