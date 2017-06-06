package com.pattern.creational.abstractfactory;

/**
 * WoodenDoorFactory class which implements interface DoorFactory
 */
public class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}