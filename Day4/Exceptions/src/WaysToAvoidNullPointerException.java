public class WaysToAvoidNullPointerException {
    public static void processOrder(String orderId) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        // Simulating order processing logic
        System.out.println("Processing order with ID: " + orderId);
    }
    public static void main(String[] args) {

        // String Comparison with Literals
        String string = null;
        // If we call str.equals("gfg"), it will throw NullPointerException.
        if("hello".equals(string)){
            System.out.println("strings are same");
        }else {
            System.out.println("string are not same");
        }

        //Check Method Arguments for Null
        String orderId = null; // Simulating an invalid input

        try {
            processOrder(orderId); // This will throw an exception.
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Use of Ternary Operator
        // If str is null, assign an empty string. Otherwise, extract the first 5 characters.
        String message = (string == null) ? "" : string.substring(0, 5);
        System.out.println(message); // Outputs: (empty string)

        string = "GeeksforGeeks";
        message = (string == null) ? "" : string.substring(0, 5);
        System.out.println(message); // Outputs: Geeks

    }
}
