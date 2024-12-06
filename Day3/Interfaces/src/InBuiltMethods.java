import java.util.function.*;

public class InBuiltMethods {
    public static void main(String[] args) {
        //takes only one argument as input
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("Good Morning");

        //takes two argument as input
        BiConsumer<String, Integer> printDetails = (name, age) -> System.out.println(name + " is " + age + " years old.");
        printDetails.accept("abc", 21);

        //to test weather the given string is empty or not
        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        System.out.println(isNotEmpty.test("Hello"));
        System.out.println(isNotEmpty.test(""));

        //to test weather given string is equal or not
        BiPredicate<String, String> areEqual = (str1, str2) -> str1.equals(str2);
        System.out.println(areEqual.test("Hello", "Hello"));
        System.out.println(areEqual.test("Hello", "World"));

        //this will take integer as arg and returns int
        //to square a number
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        //to add a number
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(5, 10));

        //special Function it takes and return same type
        UnaryOperator<Integer> doubleValue = x -> x * x;
        System.out.println(doubleValue.apply(5));

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(3, 4));

        Supplier<String> getHello = () -> "Good, mornig!";
        System.out.println(getHello.get());
    }
}
