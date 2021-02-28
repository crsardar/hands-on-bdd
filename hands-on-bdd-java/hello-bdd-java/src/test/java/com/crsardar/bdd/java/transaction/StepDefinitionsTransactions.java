package com.crsardar.bdd.java.transaction;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class StepDefinitionsTransactions {

    /*
    // This will also work as Custom Class
    static class Transaction {
        public double value;

        public Transaction(double value){

            this.value = value;
        }
    }

    @DataTableType
    public Transaction defineTransaction(Map<String, String> entry){
        return new Transaction(Double.valueOf(entry.get("transactions")));
    }
     */

    @DataTableType
    public Double defineTransaction(Map<String, String> entry){
        return Double.valueOf(entry.get("transactions"));
    }

    public double transactionTotal = 0.0f;

    @Given("User as Chitta")
    public void user_as_Chitta() {

        transactionTotal = 0.0f;
    }

    @When("Daily transactions are")
    public void daily_transactions_are_integer_transactions(List<Double> transactions) {

        System.out.println("\n\n\n---- All Transactions : ");

        transactions.forEach(transaction -> {

            System.out.println(transaction);

            transactionTotal += transaction;
        });
    }

    @Then("Total transaction amount should be {double}.")
    public void total_transaction_amount_should_be(Double givenTotal) {

        Assert.assertTrue(transactionTotal == givenTotal.doubleValue());
    }
}
