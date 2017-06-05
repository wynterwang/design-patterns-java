package com.pattern.creational.factorymethod;

/**
 * CommunityExecutive class which implements interface Interviewer
 */
public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about community building!");
    }
}