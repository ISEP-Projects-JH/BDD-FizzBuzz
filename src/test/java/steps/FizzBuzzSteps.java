package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class FizzBuzzSteps {

    private String result;
    private FizzBuzz fizzBuzz;

    @Given("I have a FizzBuzz converter")
    public void i_have_a_fizzbuzz_converter() {
        fizzBuzz = new FizzBuzz();
    }

    @When("I convert {int}")
    public void i_convert(Integer number) {
        result = fizzBuzz.convert(number);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
