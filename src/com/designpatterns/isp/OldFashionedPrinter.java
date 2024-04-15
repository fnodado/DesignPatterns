package com.designpatterns.isp;

public class OldFashionedPrinter implements Machine{
    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) throws Exception {
        // no use
    }

    @Override
    public void scan(Document d) throws Exception {
        //no use
    }
}
