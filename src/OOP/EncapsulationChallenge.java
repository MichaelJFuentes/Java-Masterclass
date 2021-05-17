package OOP;

public class EncapsulationChallenge {
    public static void main(String[] args) {
        Printer printer = new Printer(99, 0, false);
        System.out.println(printer);
        printer.printPages();
        printer.printPages();
        System.out.println(printer);
        printer.fillToner();
        System.out.println(printer);
        System.out.println(printer.getNumberOfPages());
        printer.printPages(4);
        System.out.println(printer);

    }
}
