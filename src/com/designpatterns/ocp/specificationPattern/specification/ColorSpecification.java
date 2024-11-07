package com.designpatterns.ocp.specificationPattern.specification;

import com.designpatterns.ocp.initial.Color;
import com.designpatterns.ocp.initial.Product;
import com.designpatterns.ocp.specificationPattern.specificationI.Specification;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == this.color;
    }
}
