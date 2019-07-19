package com.stackroute.oops;

public class Printer {

      //private fields of the printer class
    private int tonerLevel;
    private int noOfPaper;
    private int numberOfPagesPrinted;
    private boolean doubleSided;

   //generating the setters and getters
    public int getTonerLevel()
    {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel)
    {
        this.tonerLevel = tonerLevel;
    }

    public int getNoOfPaper()
    {
        return noOfPaper;
    }

    public void setNoOfPaper(int noOfPaper)
    {
        this.noOfPaper = noOfPaper;
    }

    public int getNumberOfPagesPrinted()
    {
        return numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted)
    {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public boolean doubleSided()
    {
        return doubleSided;
    }

    public void setDoubleSided(boolean doubleSided) {

        this.doubleSided = doubleSided;
    }
 //creating the constructor and passing the arguments
    public Printer(int tonerLevel, int noOfPaper, int numberOfPagesPrinted, boolean doubleSided) {
        //if the tonerlevel is greater than 0 tonerlevel value is stored
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.noOfPaper = noOfPaper;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.doubleSided = doubleSided;
    }
    //to check two side printing  if the condition is true or even then it returns true else returns false
    private boolean printTwoSides(double numberToPrint) {
        if((noOfPaper - ((int) numberToPrint / 2)) < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //to check the tonerlevel it depends upon the number of pages to be printed
    private boolean tonerLevel(double numberToPrint) {
        if((tonerLevel - ((int) numberToPrint / 2)) < 0) {
            System.out.println(tonerLevel);
           return true;
        }
        else {
            return false;
        }
    }
    
    public void printAPage(double pagesToPrint) {
        if (doubleSided == false) {
            if (tonerLevel == 0) {
                System.out.println("Printer is out of toner");
            }
            if (noOfPaper == 0) {
                System.out.println("Printer is out of paper");
            }

        } else if (doubleSided = true) {
            if (pagesToPrint % 2 == 0) {
                if (tonerLevel == 0) {
                    System.out.println("Printer is Out of Toner");
                }
                if (noOfPaper == 0) {
                    System.out.println("Printer is Out of Paper");
                }
                if (printTwoSides(pagesToPrint) && (noOfPaper != 0)) {
                    noOfPaper -= pagesToPrint / 2;
                    System.out.println("OOPS! There is no Paper in the printer");
                }
            }

        }

        }
    }
