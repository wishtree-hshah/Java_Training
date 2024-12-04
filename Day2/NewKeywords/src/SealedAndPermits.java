// Animal class is a sealed class i.e. it does
// not allow any class to access it other than permitted class
sealed class Animal permits Dog,Cat{
    public void sound() {
        System.out.println("animal make sound");
    }
}

final class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}

final class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meows");
    }
}

//Animal class can't be extended here
//final class Lion extends Animal{
//
//}

public class SealedAndPermits {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}
