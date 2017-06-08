package com.pattern.creational.builder;

/**
 * BurgerBuilder class
 */
public class BurgerBuilder {
    private int size;

    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean lettuce = false;
    private boolean tomato = false;

    public BurgerBuilder(int _size) {
        size = _size;
    }

    public BurgerBuilder addCheese() {
        cheese = true;
        return this;
    }

    public BurgerBuilder addPepperoni() {
        pepperoni = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        tomato = true;
        return this;
    }

    /**
     * Build a burger
     * @return a burger
     */
    public Burger build() {
        return new Burger(size, cheese,
            pepperoni, lettuce, tomato);
    }
}