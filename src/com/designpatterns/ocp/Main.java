package com.designpatterns.ocp;

import com.designpatterns.ocp.specificationPattern.BetterFilter;
import com.designpatterns.ocp.specificationPattern.specification.BiSpecification;
import com.designpatterns.ocp.specificationPattern.specification.ColorSpecification;
import com.designpatterns.ocp.specificationPattern.specification.SizeSpecification;
import com.designpatterns.ocp.specificationPattern.specificationI.*;
import com.designpatterns.ocp.initial.Color;
import com.designpatterns.ocp.initial.Product;
import com.designpatterns.ocp.initial.ProductFilter;
import com.designpatterns.ocp.initial.Size;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    // without OCP
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old):");
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));


        // vv AFTER with OCP
        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new):");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large products:");
        bf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(p -> System.out.println(" - " + p.name + " is large"));

        System.out.println("Large blue items:");
        bf.filter(products,
                        new BiSpecification<>(
                                new ColorSpecification(Color.BLUE),
                                new SizeSpecification(Size.LARGE)
                        ))
                .forEach(p -> System.out.println(" - " + p.name + " is large and blue"));

        /*
        Since Specification interface is a 1 method interface , then it can be a functional interface where the
        implementation of its method can be anonymous

         */
        Specification<Product> lambdaSpec = p -> p.size == Size.LARGE;

        System.out.println("Large products:");
        bf.filter(products, lambdaSpec)
                .forEach(product -> System.out.println(" - " + product.name + " are large products"));

    }
}
