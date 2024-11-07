package com.designpatterns.ocp.specificationPattern.specification;

import com.designpatterns.ocp.specificationPattern.specificationI.Specification;

public class BiSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public BiSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
