package LiskovSubstitutionPrinciple;

/**
 * Penguin class can extend non flying bird
 */
class Penguin extends NonFlyingBird {
    @Override
    public void walk() {
        System.out.println("Penguin is a bird but can't fly but can walk");
    }
}
