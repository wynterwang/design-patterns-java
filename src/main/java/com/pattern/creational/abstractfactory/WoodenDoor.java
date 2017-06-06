package com.pattern.creational.abstractfactory;

/**
 * WoodenDoor class which implements interface Door
 */
public class WoodenDoor implements Door {
    @Override
    public void showDescription() {
        System.out.println("wooden door");
    }
}