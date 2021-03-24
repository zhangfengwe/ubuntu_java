package com.fwzhang.second.filter.natived;

import com.fwzhang.second.entity.domain.MsgData;
import com.fwzhang.second.entity.domain.Product;
import com.fwzhang.second.entity.enumeration.ProductCodeEnum;

import java.util.List;

public class TransProductHandler extends AbstractProductHandler{
    @Override
    public boolean onProduct(Product product) {
        return ProductCodeEnum.TRANS_PRODUCT.equals(product.getProductCode());
    }

    @Override
    public void handle(List<Product> products) {
        System.out.println("流水");
        products.stream().filter(this::onProduct).forEach(System.out::println);
    }
}
