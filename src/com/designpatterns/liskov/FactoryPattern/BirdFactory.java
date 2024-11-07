package com.designpatterns.liskov.FactoryPattern;

import com.designpatterns.liskov.Bird;
import com.designpatterns.liskov.notLiskov.Penguin;
import com.designpatterns.liskov.notLiskov.Sparrow;

public class BirdFactory {
    public static Bird createBird(String birdType) {
        switch (birdType.toLowerCase()) {
            case "sparrow":
                return new Sparrow();  // A flying bird
            case "penguin":
                return new Penguin();  // A non-flying bird
            default:
                throw new IllegalArgumentException("Unknown bird type: " + birdType);
        }
    }
}
