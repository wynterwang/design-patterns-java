package com.pattern.creational.builder;

/**
 * Real world example:
 * Imagine you are at Hardee's and you order a specific deal,
 * lets say, "Big Hardee" and they hand it over to you without
 * any questions; this is the example of simple factory. But
 * there are cases when the creation logic might involve more
 * steps. For example you want a customized Subway deal, you
 * have several options in how your burger is made e.g what
 * bread do you want? what types of sauces would you like?
 * What cheese would you want? etc. In such cases builder
 * pattern comes to the rescue.
 *
 * Allows you to create different flavors of an object while
 * avoiding constructor pollution. Useful when there could be
 * several flavors of an object. Or when there are a lot of
 * steps involved in creation of an object.
 *
 * Wikipedia:
 * The builder pattern is an object creation software design
 * pattern with the intentions of finding a solution to the
 * telescoping constructor anti-pattern.
 *
 * See: https://github.com/kamranahmedse/design-patterns-
 * for-humans#-builder
 */
public class App {
    static void main(String []args) {
        Burger burger = (new BurgerBuilder(7))
                                .addCheese()
                                .addLettuce()
                                .addTomato()
                                .build();
        burger.showBurger();
    }
}