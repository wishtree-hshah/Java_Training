package InterfaceSegregationPrinciple;

/**
 * SimplePrinter can only implement print
 */
class SimplePrinter implements IPrint {
    @Override
    public void print() {
        System.out.println("simple printer can print");
    }
}
