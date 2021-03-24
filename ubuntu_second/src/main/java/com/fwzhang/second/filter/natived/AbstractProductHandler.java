package com.fwzhang.second.filter.natived;

import com.fwzhang.second.entity.domain.Product;

import java.util.List;

public abstract class AbstractProductHandler {

    public abstract boolean onProduct(Product product);

    public abstract void handle(List<Product> products);
}
