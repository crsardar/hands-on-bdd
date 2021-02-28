package com.crsardar.bdd.java.hello;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsPerson {

    @Given("{person} is located/standing {int} metre(s) from {person}")
    public void person_is_metres_from_Sean(Person chitta, Integer distance, Person shiva) {

        System.out.println("Person = " + chitta + " : Optima = " + shiva);
    }

    @When("Chittaranjan greets Shiva with {string}")
    public void chittaranjan_greets_Shiva_with(String string) {

    }

    @Then("Shiva replies {string}")
    public void shiva_replies(String string) {

    }
}
