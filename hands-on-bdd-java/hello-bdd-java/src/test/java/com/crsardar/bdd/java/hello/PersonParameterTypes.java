package com.crsardar.bdd.java.hello;

import io.cucumber.java.ParameterType;

public class PersonParameterTypes {

    @ParameterType("Chittaranjan|Shiva")
    public Person person(String name) {
        return new Person(name);
    }
}
