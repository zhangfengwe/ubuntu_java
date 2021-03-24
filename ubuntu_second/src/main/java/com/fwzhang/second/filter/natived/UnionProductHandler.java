package com.fwzhang.second.filter.natived;

import com.fwzhang.second.entity.domain.Product;
import com.fwzhang.second.entity.enumeration.ProductCodeEnum;

import java.util.List;

public class UnionProductHandler extends AbstractProductHandler {
    @Override
    public boolean onProduct(Product product) {
        return ProductCodeEnum.UNION_PRODUCT.equals(product.getProductCode());
    }

    @Override
    public void handle(List<Product> products) {
        System.out.println("联合");
        products.stream().filter(this::onProduct).forEach(System.out::println);
    }
}
