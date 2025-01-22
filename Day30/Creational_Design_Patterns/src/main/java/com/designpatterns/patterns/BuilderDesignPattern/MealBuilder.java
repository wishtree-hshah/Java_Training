package com.designpatterns.patterns.BuilderDesignPattern;

/**
 * The type Meal builder.
 */
// Builder class used to create a Meal
class MealBuilder {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;

    /**
     * Sets main course.
     *
     * @param mainCourse the main course
     * @return the main course
     */
    public MealBuilder setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    /**
     * Sets side dish.
     *
     * @param sideDish the side dish
     * @return the side dish
     */
    public MealBuilder setSideDish(String sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    /**
     * Sets drink.
     *
     * @param drink the drink
     * @return the drink
     */
    public MealBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    /**
     * Sets dessert.
     *
     * @param dessert the dessert
     * @return the dessert
     */
    public MealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    /**
     * Build meal.
     *
     * @return the meal
     */
    public Meal build() {
        Meal meal = new Meal();
        meal.setMainCourse(this.mainCourse);
        meal.setSideDish(this.sideDish);
        meal.setDrink(this.drink);
        meal.setDessert(this.dessert);
        return meal;
    }
}
