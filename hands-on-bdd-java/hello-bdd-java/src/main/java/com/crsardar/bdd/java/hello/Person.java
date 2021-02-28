package com.crsardar.bdd.java.hello;

public class Person {

    private final String name;

    private String greeting;

    private String reply;

    public Person(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", greeting='" + greeting + '\'' +
                ", reply='" + reply + '\'' +
                '}';
    }
}
