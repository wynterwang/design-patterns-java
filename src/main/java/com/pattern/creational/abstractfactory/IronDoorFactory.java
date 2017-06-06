package com.pattern.creational.abstractfactory;

/**
 * IronDoorFactory class which implements interface DoorFactory
 */
public class IronDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}