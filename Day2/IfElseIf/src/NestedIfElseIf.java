public class NestedIfElseIf {
    public static void main(String[] args) {
        int marks = 85;
        String category = "science";

        if (marks >= 90) {
            if (category == "science") {
                System.out.println("Grade: A (Science)");
            } else {
                System.out.println("Grade: A");
            }
        } else if (marks >= 80) {
            if (category == "science") {
                System.out.println("Grade: B (Science)");
            } else {
                System.out.println("Grade: B");
            }
        } else {
            System.out.println("Grade: Below B");
        }
    }
}
