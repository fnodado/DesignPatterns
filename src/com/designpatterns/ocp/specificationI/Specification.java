package com.designpatterns.ocp.specificationI;


/*
        Specification Pattern

      - we introduce 2 interfaces for open for extension pattern:
      Specification interface
      Filter interface


 */
public interface Specification<T> {

    boolean isSatisfied(T item);
}
