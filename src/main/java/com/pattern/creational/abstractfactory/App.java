package com.pattern.creational.abstractfactory;

/**
 * Real world example:
 * Extending our door example from Simple Factory. Based
 * on your needs you might get a wooden door from a wooden
 * door shop, iron door from an iron shop or a PVC door
 * from the relevant shop. Plus you might need a guy with
 * different kind of specialities to fit the door, for
 * example a carpenter for wooden door, welder for iron
 * door etc. As you can see there is a dependency between
 * the doors now, wooden door needs carpenter, iron door
 * needs a welder etc.
 *
 * A factory of factories; a factory that groups the
 * individual but related/dependent factories together
 * without specifying their concrete classes.
 *
 * Wikipedia:
 * The abstract factory pattern provides a way to encapsulate
 * a group of individual factories that have a common theme
 * without specifying their concrete classes.
 *
 * When to Use?
 * When there are interrelated dependencies with
 * not-that-simple creation logic involved.
 *
 * See: https://github.com/kamranahmedse/design-patterns-
 * for-humans#-abstract-factory
 */
public class App {
    public static void main(String []args) {
        {
            DoorFactory doorFactory = new WoodenDoorFactory();
            Door door = doorFactory.makeDoor();
            DoorFittingExpert doorFittingExpert = doorFactory.makeFittingExpert();

            door.showDescription();
            doorFittingExpert.showDescription();
        }
        {
            DoorFactory doorFactory = new IronDoorFactory();
            Door door = doorFactory.makeDoor();
            DoorFittingExpert doorFittingExpert = doorFactory.makeFittingExpert();

            door.showDescription();
            doorFittingExpert.showDescription();
        }
    }
}