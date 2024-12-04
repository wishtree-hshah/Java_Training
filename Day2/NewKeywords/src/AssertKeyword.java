public class AssertKeyword {
    public static void main(String[] args) {
        int number = 10;

        // Assert that the number is positive
        assert number > 0 : "Number must be positive";

        // If the assertion fails, this message will be displayed
        System.out.println("Number is " + number);
    }
}


//To see assertion error we have to enable by -ea
//command: java -ea AssertKeyword
//Exception in thread "main" java.lang.AssertionError: Number must be positive
//at AssertKeyword.main(AssertKeyword.java:6)