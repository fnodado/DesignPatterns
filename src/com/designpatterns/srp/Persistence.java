package com.designpatterns.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

/*
    Persistence class is the representation of "separation of concern" from the
    Journal class. Since this also has single responsibility, it is also considered
    as Single Responsibility Principle.
 */
public class Persistence {

    public void save(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists()){
            try(PrintStream out = new PrintStream(filename)){
                out.println(journal.toString());
            }
        }
    }
    public Journal load(String filename){
        return null;
    }
    public void load(URL url){}

}
