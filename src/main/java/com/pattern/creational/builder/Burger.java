package com.pattern.creational.builder;

/**
 * Burger class
 */
public class Burger {
    private int size;

    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public Burger(int _size, boolean _cheese,
        boolean _pepperoni, boolean _lettuce,
        boolean _tomato) {
        size = _size;
        cheese = _cheese;
        pepperoni = _pepperoni;
        lettuce = _lettuce;
        tomato = _tomato;
    }

    public void showBurger() {
        System.out.println((cheese ? "cheese + " : "") +
            (pepperoni ? "pepperoni + " : "") +
            (lettuce ? "lettuce + " : "") +
            (tomato ? "tomato + " : "") +
            size + " inch burger");
    }
}