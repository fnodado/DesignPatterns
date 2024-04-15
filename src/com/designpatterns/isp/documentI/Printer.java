package com.designpatterns.isp.documentI;

import com.designpatterns.isp.Document;

public interface Printer {
    void Print(Document d) throws Exception;
}
