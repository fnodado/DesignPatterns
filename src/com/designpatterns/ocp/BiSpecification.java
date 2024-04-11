package com.designpatterns.ocp;

import com.designpatterns.ocp.specificationI.Specification;

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
