package LiskovSubstitutionPrinciple;

/**
 * Eagle class can extend flying bird
 */
class Eagle extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Eagle is a bird and can fly");
    }
}
