package steps;

public class FizzBuzz {

    /**
     * Convert a number to "Fizz", "Buzz", "FizzBuzz" or the number as a string.
     *
     * @param number the number to convert
     * @return the FizzBuzz representation
     */
    public String convert(int number) {
        String result = (number % 3 == 0 ? "Fizz" : "") + (number % 5 == 0 ? "Buzz" : "");
        return result.isEmpty() ? Integer.toString(number) : result;
    }
}