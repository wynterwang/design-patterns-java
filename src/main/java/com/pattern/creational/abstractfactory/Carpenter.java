package com.pattern.creational.abstractfactory;

/**
 * Carpenter class which implements interface DoorFittingExpert
 */
public class Carpenter implements DoorFittingExpert {
    @Override
    public void showDescription() {
        System.out.println("I can only fit wooden doors");
    }
}