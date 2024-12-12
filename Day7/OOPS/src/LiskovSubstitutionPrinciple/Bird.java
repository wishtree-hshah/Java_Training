package LiskovSubstitutionPrinciple;

/**
 * Main Class to implement flying and nonflying bird
 */
public class Bird {
    public static void main(String[] args) {
        FlyingBird flyingBird = new Eagle();
        flyingBird.fly();

        NonFlyingBird nonFlyingBird = new Penguin();
        nonFlyingBird.walk();
    }
}
