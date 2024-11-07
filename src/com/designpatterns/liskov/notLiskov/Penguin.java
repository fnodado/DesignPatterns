package com.designpatterns.liskov.notLiskov;

import com.designpatterns.liskov.Bird;

public class Penguin extends Bird {
    // Penguins cannot fly, so we override fly method
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly.");
    }
}