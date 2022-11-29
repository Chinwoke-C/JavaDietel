package EncapsulationPractice;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int fillToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else {
            return -1;
        }

    }

    public void DuplexPrinter(int paperSide) {
        if (paperSide == 2) {
            System.out.println("it is a duplex printer");
        }
        System.out.println("not a duplex printer");
    }

    public int pagesPrinted(int pages) {
        return numberOfPages;
    }
}

