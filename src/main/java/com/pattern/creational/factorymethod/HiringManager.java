package com.pattern.creational.factorymethod;

public abstract class HiringManager {
    /**
     * Make a Interviewer
     * @return a interviewer
     */
    public abstract Interviewer makeInterviewer();

    /**
     * Take a Interview
     */
    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}