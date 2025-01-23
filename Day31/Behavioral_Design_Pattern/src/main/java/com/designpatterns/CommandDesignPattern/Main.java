package com.designpatterns.CommandDesignPattern;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Chef chef = new Chef();
        Order pizzaOrder = new PizzaOrder(chef);
        Order pastaOrder = new PastaOrder(chef);
        Waiter waiter = new Waiter();

        waiter.takeOrder(pizzaOrder);
        waiter.serveOrder();

        waiter.takeOrder(pastaOrder);
        waiter.serveOrder();
    }
}
