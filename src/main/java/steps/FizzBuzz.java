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

    public String convertV1(int number) {
        boolean shouldFizz = number % 3 == 0;
        boolean shouldBuzz = number % 5 == 0;
        String toS = Integer.toString(number);
        if (toS.contains("3")) {
            shouldFizz = true;
        }
        if (toS.contains("5")) {
            shouldBuzz = true;
        }
        if (shouldFizz && shouldBuzz) {
            return "FizzBuzz";
        } else if (shouldFizz) {
            return "Fizz";
        } else if (shouldBuzz) {
            return "Buzz";
        } else {
            return toS;
        }
    }
}