import java.util.Arrays;
import java.util.List;

/**
 * Anonymous object to find max from ArrayList
 */
public class AnonymousObject {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 4);

        // Using an anonymous object to find the maximum number
        Integer maxNumber = new Object() {
            public Integer findMax(List<Integer> list) {
                Integer max = list.get(0);
                for (Integer num : list) {
                    if (num > max) {
                        max = num;
                    }
                }
                return max;
            }
        }.findMax(numbers);

        System.out.println("Maximum number: " + maxNumber);
    }
}
