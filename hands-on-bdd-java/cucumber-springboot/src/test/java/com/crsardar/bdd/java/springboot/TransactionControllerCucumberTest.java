package com.crsardar.bdd.java.springboot;

import com.crsardar.bdd.java.model.Transaction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@CucumberContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransactionControllerCucumberTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private int receivedNoOfTransactions = 0;
    private int givenNoOfTransactions = 0;


    @Given("the {int}")
    public void the(Integer givenNoOfTransactions) {

        this.givenNoOfTransactions = givenNoOfTransactions;
    }

    @When("called the getTransaction API")
    public void called_the_getTransaction_API() {

        String url ="http://localhost:" + port + "/cucumber-springboot/transaction/" + givenNoOfTransactions;

        Transaction transactions[] = testRestTemplate.getForObject(url, Transaction[].class);

        assertThat(transactions != null);

        receivedNoOfTransactions = transactions.length;
        assertThat(receivedNoOfTransactions > 0);

//        System.out.println("\n\n\n");
//        for (Transaction transaction: transactions) {
//            System.out.println(transaction);
//        }
//        System.out.println("\n\n\n");
    }

    @Then("it should return {int}")
    public void it_should_return(Integer expectedNoOfTransactions) {

        assertThat(receivedNoOfTransactions == expectedNoOfTransactions);
    }
}
