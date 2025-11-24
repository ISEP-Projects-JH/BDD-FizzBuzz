package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class FizzBuzzV2Steps {

    private String result;
    private FizzBuzz fizzBuzz;

    @Given("I have a FizzBuzzV2 converter")
    public void i_have_a_fizzbuzz_converter() {
        fizzBuzz = new FizzBuzz();
    }

    @When("I convertV2 {int}")
    public void i_convert(Integer number) {
        result = fizzBuzz.convertV2(number);
    }

    @Then("the V2 result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
