package com.designpatterns.ocp;


import java.util.List;
import java.util.stream.Stream;

/*
    Open-Closed Principle (OCP)

    - open for extension but closed for modification by using
    "Specification pattern"
 */

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product>product, Color color){
        return product.stream().filter(p->p.color==color);
    }

    public Stream<Product> filterBySize(List<Product>product, Size size){
        return product.stream().filter(p->p.size==size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product>product, Size size, Color color){
        return product.stream().filter(p->p.size==size && p.color==color);
    }

}
