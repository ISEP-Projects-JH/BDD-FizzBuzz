package steps;

public class FizzBuzz {

    public String convert(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("number must not be null");
        }

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        }
        if (divisibleBy3) {
            return "Fizz";
        }
        if (divisibleBy5) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}