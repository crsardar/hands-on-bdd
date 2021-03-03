package com.crsardar.bdd.java.springboot;

import com.crsardar.bdd.java.model.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class TransactionController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Cucumber with SpringBoot!";
    }

    @GetMapping("/transaction/{noOfTransactions}")
    public List<Transaction> getTransaction(@PathVariable("noOfTransactions") final int noOfTransactions){

        List<Transaction> transactionList = new ArrayList<>();

        if(noOfTransactions > 0){

            for(int i=0; i< noOfTransactions; i++){

                Transaction transaction = new Transaction(UUID.randomUUID().toString(),
                        (i+5.0f), Transaction.CURRENCY.INR, (System.currentTimeMillis() - (i*86400000)));

                transactionList.add(transaction);

            }

        }

        return transactionList;
    }
}
