package com.designpatterns.srp;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        j.addEntry("I slept today");

        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "D:\\projects\\DesignPatterns\\src\\resources\\journal";
        p.save(j, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
