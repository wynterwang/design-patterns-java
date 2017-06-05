package com.pattern.creational.simplefactory;

/**
 * DoorFactory class
 */
public class DoorFactory {
    /**
     * Make a new door
     * @param  width  width of door
     * @param  height height of door
     * @return        the new door
     */
    public static Door makeDoor(double width, double height) {
        return new WoodenDoor(width, height);
    }
}