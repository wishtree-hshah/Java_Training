package com.designpatterns.CommandDesignPattern;

/**
 * The type Waiter.
 */
class Waiter {
    private Order order;

    /**
     * Take order.
     *
     * @param order the order
     */
    public void takeOrder(Order order) {
        this.order = order;
    }

    /**
     * Serve order.
     */
    public void serveOrder() {
        order.execute();
    }
}
