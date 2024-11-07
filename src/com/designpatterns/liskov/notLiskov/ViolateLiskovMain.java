package com.designpatterns.liskov.notLiskov;

import com.designpatterns.liskov.Bird;

public class ViolateLiskovMain {
    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        makeBirdFly(sparrow);  // This works fine.
        makeBirdFly(penguin);  // This will throw an exception, violating LSP.
    }
}
