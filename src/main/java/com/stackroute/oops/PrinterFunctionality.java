package com.stackroute.oops;
//Main class for printing the set values
public class PrinterFunctionality {

    public static void main(String[] args) {
        //generating object for printer class and passing the parameters
        Printer printer = new Printer(100,84,4,true);
         System.out.println(printer.getNoOfPaper());
         System.out.println(printer.getTonerLevel());
         System.out.println(printer.getNumberOfPagesPrinted());
         System.out.println(printer.doubleSided());
    }
}