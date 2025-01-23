package com.designpatterns.CommandDesignPattern;

/**
 * The type Pasta order.
 */
class PastaOrder implements Order {
    private Chef chef;

    /**
     * Instantiates a new Pasta order.
     *
     * @param chef the chef
     */
    public PastaOrder(Chef chef) {
        this.chef = chef;
    }

    public void execute() {
        chef.preparePasta();
    }
}
