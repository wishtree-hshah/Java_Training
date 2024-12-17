import java.util.Optional;

/**
 * This class demonstrates the usage of Java 8's Optional class
 */
public class OptionalClassExample {

    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nullableOptional = Optional.ofNullable(null);

        System.out.println("Non-empty Optional: " + nonEmptyOptional);
        System.out.println("Empty Optional: " + emptyOptional);
        System.out.println("Nullable Optional (null): " + nullableOptional);

        checkPresence(nonEmptyOptional,emptyOptional);
        getValueWithFallback(nonEmptyOptional,emptyOptional);
        performActionIfPresent(nonEmptyOptional,emptyOptional);
        transformValuesWithMap(nonEmptyOptional);
        transformWithFlatMap(nonEmptyOptional);
        filterValues(nonEmptyOptional);
    }

    /**
     * Checking the optional field is present or not
     * @param nonEmptyOptional
     * @param emptyOptional
     */
    static void checkPresence(Optional<String> nonEmptyOptional,Optional<String> emptyOptional) {
        System.out.println("Is value present? " + nonEmptyOptional.isPresent());
        System.out.println("Is value present in empty Optional? " + emptyOptional.isPresent()); // false
    }

    /**
     * Getting value with fallback
     * @param nonEmptyOptional
     * @param emptyOptional
     */
    static void getValueWithFallback(Optional<String> nonEmptyOptional,Optional<String> emptyOptional) {
        // Using orElse
        System.out.println("Value with orElse with non-empty optional: " + nonEmptyOptional.orElse("Default Value"));
        System.out.println("Value with orElse with empty optional: " + emptyOptional.orElse("Default Value"));

        // Using orElseGet
        System.out.println("Value with orElseGet with non-empty optional: " + nonEmptyOptional.orElseGet(() -> "Generated Value"));
        System.out.println("Value with orElseGet with empty optional: " + emptyOptional.orElseGet(() -> "Generated Value"));

        // Using orElseThrow
        try {
            System.out.println("Value with orElseThrow with non-empty optional: "+ nonEmptyOptional.orElseThrow(() -> new RuntimeException("No value present!")));
            System.out.println("Value with orElseThrow with empty optional: "+ nonEmptyOptional.orElseThrow(() -> new RuntimeException("No value present!")));
        } catch (RuntimeException e) {
            System.out.println("Exception from orElseThrow: " + e.getMessage());
        }
    }

    /**
     * Performing an action if value is present
     * @param nonEmptyOptional
     * @param emptyOptional
     */
    static void performActionIfPresent(Optional<String> nonEmptyOptional,Optional<String> emptyOptional) {
        nonEmptyOptional.ifPresent(value -> System.out.println("Value exists: " + value));
        emptyOptional.ifPresent(value -> System.out.println("Value exists: " + value));
    }

    /**
     * Transforming values with map
     * @param nonEmptyOptional
     */
    static void transformValuesWithMap(Optional<String> nonEmptyOptional) {
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        System.out.println("Length of string: " + lengthOptional.orElse(0));
    }

    /**
     * Transforming with flatMap
     * @param nonEmptyOptional
     */
    static void transformWithFlatMap(Optional<String> nonEmptyOptional) {
        Optional<String> upperCaseOptional = nonEmptyOptional.flatMap(value -> Optional.of(value.toUpperCase()))
                                                            .flatMap(value -> Optional.of(value + "!!"));
        System.out.println("Flat mapped value: " + upperCaseOptional.orElse("No Value"));
    }

    /**
     * Filtering values
     * @param nonEmptyOptional
     */
    static void filterValues(Optional<String> nonEmptyOptional) {
        Optional<String> filtered = nonEmptyOptional.filter(value -> value.startsWith("H"));
        System.out.println("Filtered value: " + filtered.orElse("Filtered out"));

        Optional<String> noMatch = nonEmptyOptional.filter(value -> value.startsWith("X"));
        System.out.println("Filtered value with no match: " + noMatch.orElse("Filtered out"));
    }
}
