package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class FizzBuzzV1Steps {

    private String result;
    private FizzBuzz fizzBuzz;

    @Given("I have a FizzBuzzV1 converter")
    public void i_have_a_fizzbuzz_converter() {
        fizzBuzz = new FizzBuzz();
    }

    @When("I convertV1 {int}")
    public void i_convert(Integer number) {
        result = fizzBuzz.convertV1(number);
    }

    @Then("the V1 result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
