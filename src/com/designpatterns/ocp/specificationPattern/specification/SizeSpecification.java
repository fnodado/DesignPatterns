package com.designpatterns.ocp.specificationPattern.specification;

import com.designpatterns.ocp.initial.Product;
import com.designpatterns.ocp.initial.Size;
import com.designpatterns.ocp.specificationPattern.specificationI.Specification;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == this.size;
    }
}
