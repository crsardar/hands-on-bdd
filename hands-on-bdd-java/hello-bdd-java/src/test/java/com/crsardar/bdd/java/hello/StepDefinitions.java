package com.crsardar.bdd.java.hello;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    private Calculator calculator;
    private long sum = 0;

    // Example of a Custom Parameter
    @Given("A {calculator} is provided")
    public void a_calculator_is_provided(Calculator calculator) {
        this.calculator = calculator;
    }

    @When("call add\\({int}, {int})")
    public void call_add(Integer int1, Integer int2) {
        sum = calculator.add(int1, int2);
    }
    @Then("return sum of {int}")
    public void return_sum_of(Integer int1) {
        Assert.assertTrue(sum == int1);
    }
}
