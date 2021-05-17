package OOP;

public class Printer {
    private int tonerLevel;
    private int numberOfPages = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        if (numberOfPages > 0 ) {
            this.numberOfPages = numberOfPages;
        }
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void printPages(int numberOfPages) {
        if (isDuplex) {
            for (int i = 0; i < numberOfPages; i += 2) {
                this.printPages();
            }
        } else {
            for (int i = 0; i < numberOfPages; i++) {
                this.printPages();
            }
        }

    }

    public void printPages() {
        numberOfPages++;
        tonerLevel -= .01;
    }

    public void fillToner(int tonerLevel) {
        if (tonerLevel > 0 && tonerLevel < 100 - this.tonerLevel ) {
            this.tonerLevel += tonerLevel;
        } else {
            this.fillToner();
        }
    }

    public void fillToner() {
        this.tonerLevel = 100;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", numberOfPages=" + numberOfPages +
                ", isDuplex=" + isDuplex +
                '}';
    }
}
