package com.designpatterns.isp;

import com.designpatterns.isp.documentI.MultiFunctionDevice;
import com.designpatterns.isp.documentI.Printer;
import com.designpatterns.isp.documentI.Scanner;

//using decorator pattern
public class MultiFunctionMachine implements MultiFunctionDevice {
    // compose this out of several modules
    private Printer printer;
    private Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner)
    {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void Print(Document d) throws Exception
    {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception
    {
        scanner.Scan(d);
    }
}
