package com.crsardar.bdd.java.hello;

import io.cucumber.java.ParameterType;

public class ParameterTypes {

    // Example of a Custom Parameter
    @ParameterType("Calculator|calculator")
    public Calculator calculator(String calculator){
        return new Calculator();
    }
}
