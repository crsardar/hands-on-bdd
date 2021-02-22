package com.crsardar.bdd.java;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report"}
        ,features = {"classpath:com/crsardar/bdd/java/"}
        )
public class RunCucumberTest {
}
