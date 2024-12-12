package InterfaceSegregationPrinciple;

/**
 * MultiFunction printer to implement print, scan, fax
 */
class MultiFunctionPrinter implements IPrint, IScan, IFax {
    @Override
    public void print() {
        System.out.println("multi function printer can print");
    }

    @Override
    public void scan() {
        System.out.println("multi function printer can scan");
    }

    @Override
    public void fax() {
        System.out.println("multi function printer can fax");
    }
}
