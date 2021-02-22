package com.crsardar.bdd.java.socialmedia;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsLogin {

    @When("I enter Username as {string} and Password as {string}.")
    public void i_enter_Username_as_and_Password_as(String userName, String password) {
        System.out.println("User Name = " + userName + " : Password = " + password);
    }

    @Then("login should be unsuccessful.")
    public void login_should_be_unsuccessful() {

    }
}
