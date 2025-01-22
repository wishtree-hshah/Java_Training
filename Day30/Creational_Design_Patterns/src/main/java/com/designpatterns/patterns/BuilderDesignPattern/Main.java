package com.designpatterns.patterns.BuilderDesignPattern;

/**
 * The type Main.
 */
// Client code using the builder pattern
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal customMeal = mealBuilder.setMainCourse("Steak")
                .setSideDish("Fries")
                .setDrink("Coke")
//                .setDessert("Chocolate Cake")
                .build();

        System.out.println(customMeal);
    }
}
