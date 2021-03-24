package com.fwzhang.second.entity.domain;

import com.fwzhang.second.entity.enumeration.ProductCodeEnum;

public class Product {

    private final ProductCodeEnum productCode;

    private final String message;

    private final String content;

    public Product(ProductBuilder productBuilder) {
        this.productCode = productBuilder.productCode;
        this.content = productBuilder.content;
        this.message = productBuilder.message;
    }


    public static class ProductBuilder {
        private ProductCodeEnum productCode;

        private String message;

        private String content;

        public ProductBuilder(ProductCodeEnum productCodeEnum) {
            this.productCode = productCodeEnum;
        }

        public ProductBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ProductBuilder content(String content) {
            this.content = content;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public ProductCodeEnum getProductCode() {
        return productCode;
    }

    public String getMessage() {
        return message;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", message='" + message + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
