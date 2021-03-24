package com.fwzhang.test.second;

import com.fwzhang.second.entity.domain.Product;
import com.fwzhang.second.filter.natived.AbstractProductHandler;
import com.fwzhang.second.filter.natived.CreditProductHandler;
import com.fwzhang.second.filter.natived.TransProductHandler;
import com.fwzhang.second.filter.natived.UnionProductHandler;

import java.util.ArrayList;
import java.util.List;

import static com.fwzhang.second.entity.enumeration.ProductCodeEnum.*;

public class FilterPatternTest {
    private static List<AbstractProductHandler> handlerList;

    static {
        handlerList = new ArrayList<>();
        handlerList.add(new TransProductHandler());
        handlerList.add(new CreditProductHandler());
        handlerList.add(new UnionProductHandler());
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product.ProductBuilder(CREDIT_PRODUCT).message("征信1").content("征信111").build());
        productList.add(new Product.ProductBuilder(TRANS_PRODUCT).message("流水1").content("流水111").build());
        productList.add(new Product.ProductBuilder(CREDIT_PRODUCT).message("征信2").content("征信222").build());
        productList.add(new Product.ProductBuilder(UNION_PRODUCT).message("联合1").content("联合1").build());
        for (AbstractProductHandler handler: handlerList) {
            handler.handle(productList);
        }
    }
}
