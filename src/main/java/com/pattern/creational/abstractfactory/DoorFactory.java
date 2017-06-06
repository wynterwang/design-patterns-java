package com.pattern.creational.abstractfactory;

/**
 * DoorFactory interface
 */
public interface DoorFactory {
    /**
     * Make a new door
     * @return a new door
     */
    public Door makeDoor();

    /**
     * Make a door-fitting-expert
     * @return a door-fitting-expert
     */
    public DoorFittingExpert makeFittingExpert();
}