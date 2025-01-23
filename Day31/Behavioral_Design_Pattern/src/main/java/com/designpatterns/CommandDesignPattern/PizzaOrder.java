package com.designpatterns.CommandDesignPattern;

/**
 * The type Pizza order.
 */
class PizzaOrder implements Order {
    private Chef chef;

    /**
     * Instantiates a new Pizza order.
     *
     * @param chef the chef
     */
    public PizzaOrder(Chef chef) {
        this.chef = chef;
    }

    public void execute() {
        chef.preparePizza();
    }
}
