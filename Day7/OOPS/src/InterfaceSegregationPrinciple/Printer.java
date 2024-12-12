package InterfaceSegregationPrinciple;

/**
 * Main to implement different types of printer
 */
public class Printer {
    public static void main(String[] args) {
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print();
        multiFunctionPrinter.scan();
        multiFunctionPrinter.fax();
    }
}
