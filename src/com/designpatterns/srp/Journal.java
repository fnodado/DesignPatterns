package com.designpatterns.srp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/*
    Single Responsibility Principle
        - A class should only have one responsibility or job.

        - In this example, class Journal only has 1 responsibility which
        is basic CRUD functionality for entries list of string that respresents
        the journal class.

 */
public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString(){
        return String.join(System.lineSeparator(), entries);
    }



    /*
        These methods are violation of Solid Responsibility Principle
        because new functionality of entries of a journal which is saving, loading
        into a file. It should have a "separation of concern". Ideal approach is to
        separate these functionality to a different class to preserve SRP.
    */

    public void save(String filename){
        try(PrintStream out = new PrintStream(filename)){
            out.println(toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void load(String filename){}
    public void load(URL url){}

}
