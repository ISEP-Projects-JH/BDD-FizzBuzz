package steps;

public class FizzBuzz {

    /**
     * Convert a number to "Fizz", "Buzz", "FizzBuzz" or the number as a string.
     *
     * <p>This method only considers multiples:
     * - "Fizz" if number % 3 == 0
     * - "Buzz" if number % 5 == 0
     * - "FizzBuzz" if both conditions are true</p>
     *
     * @param number the number to convert
     * @return "Fizz", "Buzz", "FizzBuzz", or the decimal representation of the number
     */
    public String convert(int number) {
        String result = (number % 3 == 0 ? "Fizz" : "") + (number % 5 == 0 ? "Buzz" : "");
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    /**
     * Variant of convert that also treats numbers containing certain digits as matches.
     *
     * <p>Rules:</p>
     * <ul>
     *   <li>If the number is a multiple of 3 or its decimal representation contains '3', it is considered "Fizz".</li>
     *   <li>If the number is a multiple of 5 or its decimal representation contains '5', it is considered "Buzz".</li>
     *   <li>If both conditions hold, returns "FizzBuzz". Otherwise returns the number as a string.</li>
     * </ul>
     *
     * @param number the number to convert
     * @return "Fizz", "Buzz", "FizzBuzz", or the decimal representation of the number
     */
    public String convertV1(int number) {
        String s = Integer.toString(number);
        boolean fizz = number % 3 == 0 || s.indexOf('3') >= 0;
        boolean buzz = number % 5 == 0 || s.indexOf('5') >= 0;
        String result = (fizz ? "Fizz" : "") + (buzz ? "Buzz" : "");
        return result.isEmpty() ? s : result;
    }

    /**
     * Variant of convert that counts both multiples and digit occurrences.
     *
     * <p>Rules:</p>
     * <ul>
     *   <li>Each time the number is a multiple of 3, adds one "Fizz".</li>
     *   <li>Each '3' digit in the number adds another "Fizz".</li>
     *   <li>Each time the number is a multiple of 5, adds one "Buzz".</li>
     *   <li>Each '5' digit in the number adds another "Buzz".</li>
     *   <li>If neither count is positive, returns the number as a string.</li>
     * </ul>
     *
     * @param number the number to convert
     * @return a string matching the pattern {@code (Fizz)* (Buzz)*}, where each
     *         "Fizz" and "Buzz" reflects the counted occurrences; if both counts
     *         are zero, returns the decimal representation of the number
     */
    public String convertV2(int number) {
        String s = Integer.toString(number);
        int fizzCount = (number % 3 == 0 ? 1 : 0)
                        + (s.length() - s.replace("3", "").length());
        int buzzCount = (number % 5 == 0 ? 1 : 0)
                        + (s.length() - s.replace("5", "").length());
        if (fizzCount == 0 && buzzCount == 0) {
            return s;
        }
        return "Fizz".repeat(fizzCount) + "Buzz".repeat(buzzCount);
    }
}
