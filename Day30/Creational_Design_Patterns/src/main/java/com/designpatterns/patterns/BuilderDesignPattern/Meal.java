package com.designpatterns.patterns.BuilderDesignPattern;

/**
 * The type Meal.
 */
// Meal class represents the final product
class Meal {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;

    /**
     * Sets main course.
     *
     * @param mainCourse the main course
     */
    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    /**
     * Sets side dish.
     *
     * @param sideDish the side dish
     */
    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    /**
     * Sets drink.
     *
     * @param drink the drink
     */
    public void setDrink(String drink) {
        this.drink = drink;
    }

    /**
     * Sets dessert.
     *
     * @param dessert the dessert
     */
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Meal [Main Course=" + mainCourse + ", Side Dish=" + sideDish +
                ", Drink=" + drink + ", Dessert=" + dessert + "]";
    }
}
