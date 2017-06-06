package com.pattern.creational.abstractfactory;

/**
 * Welder class which implements interface DoorFittingExpert
 */
public class Welder implements DoorFittingExpert {
    @Override
    public void showDescription() {
        System.out.println("I can only fit iron doors");
    }
}