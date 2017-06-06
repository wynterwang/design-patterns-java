package com.pattern.creational.abstractfactory;

/**
 * IronDoor class which implements interface Door
 */
public class IronDoor implements Door {
    @Override
    public void showDescription() {
        System.out.println("iron door");
    }
}