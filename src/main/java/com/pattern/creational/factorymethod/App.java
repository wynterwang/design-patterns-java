package com.pattern.creational.factorymethod;

/**
 * Real world example:
 * Consider the case of a hiring manager. It is impossible
 * for one person to interview for each of the positions.
 * Based on the job opening, she has to decide and delegate
 * the interview steps to different people.
 *
 * It provides a way to delegate the instantiation logic to
 * child classes.
 *
 * Wikipedia:
 * In class-based programming, the factory method pattern
 * is a creational pattern that uses factory methods to deal
 * with the problem of creating objects without having to
 * specify the exact class of the object that will be created.
 * This is done by creating objects by calling a factory
 * method—either specified in an interface and implemented by
 * child classes, or implemented in a base class and optionally
 * overridden by derived classes—rather than by calling a
 * constructor.
 *
 * When to Use?
 * Useful when there is some generic processing in a class but
 * the required sub-class is dynamically decided at runtime.
 * Or putting it in other words, when the client doesn't know
 * what exact sub-class it might need.
 *
 * See: https://github.com/kamranahmedse/design-patterns-
 * for-humans#-factory-method
 */
public class App {
    public static void main(String []args) {
        HiringManager devManager = new DevelopmentManager();
        devManager.takeInterview();

        HiringManager marManager = new MarketingManager();
        marManager.takeInterview();
    }
}