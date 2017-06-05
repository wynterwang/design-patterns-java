package com.pattern.creational.factorymethod;

/**
 * Developer class which implements interface Interviewer
 */
public class Developer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about design patterns!");
    }
}