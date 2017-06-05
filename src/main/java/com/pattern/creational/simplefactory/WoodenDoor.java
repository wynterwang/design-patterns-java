package com.pattern.creational.simplefactory;

/**
 * WoodenDoor class which implements interface Door
 */
public class WoodenDoor implements Door {
    private double width;
    private double height;

    /**
     * Constructor of WoodenDoor
     * @param  _width  width of door
     * @param  _height height of door
     */
    public WoodenDoor(double _width, double _height) {
        width = _width;
        height = _height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }
}