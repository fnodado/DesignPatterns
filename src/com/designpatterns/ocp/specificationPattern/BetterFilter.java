package com.designpatterns.ocp.specificationPattern;

import com.designpatterns.ocp.initial.Product;
import com.designpatterns.ocp.specificationPattern.specificationI.Filter;
import com.designpatterns.ocp.specificationPattern.specificationI.Specification;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p-> spec.isSatisfied(p));
    }
}
