package com.crsardar.bdd.java;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report"}
        ,features = {"classpath:com/"}
)
public class CucumberTestRunner {
}
