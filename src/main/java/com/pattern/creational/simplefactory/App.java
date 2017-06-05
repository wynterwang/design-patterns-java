package com.pattern.creational.simplefactory;

/**
 * Real world example:
 * Consider, you are building a house and you need doors.
 * It would be a mess if every time you need a door, you
 * put on your carpenter clothes and start making a door
 * in your house. Instead you get it made from a factory.
 *
 * Simple factory simply generates an instance for client
 * without exposing any instantiation logic to the client.
 *
 * Wikipedia:
 * In object-oriented programming (OOP), a factory is an
 * object for creating other objects – formally a factory
 * is a function or method that returns objects of a
 * varying prototype or class from some method call, which
 * is assumed to be "new".
 *
 * When to Use?
 * When creating an object is not just a few assignments
 * and involves some logic, it makes sense to put it in a
 * dedicated factory instead of repeating the same code
 * everywhere.
 *
 * See: https://github.com/kamranahmedse/design-patterns-
 * for-humans#-simple-factory
 */
public class App {
    public static void main(String []args) {
        Door door = DoorFactory.makeDoor(100.0, 200.0);

        System.out.println("Width of the door: " + door.getWidth());
        System.out.println("Height of the door: " + door.getHeight());
    }
}