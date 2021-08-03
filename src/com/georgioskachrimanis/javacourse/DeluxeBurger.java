package com.georgioskachrimanis.javacourse;

public class DeluxeBurger extends Hamburger{

    // Constructors
    public DeluxeBurger() {

        super("Deluxe", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddition1("French Fries", 2.75);
        super.addHamburgerAddition2("Cold Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String additionalItem1, double additionalItem1Price) {
        System.out.println("Cannot add additional items to this burger.");
    }

    @Override
    public void addHamburgerAddition2(String additionalItem2, double additionalItem2Price) {
        System.out.println("Cannot add additional items to this burger.");
    }

    @Override
    public void addHamburgerAddition3(String additionalItem3, double additionalItem3Price) {
        System.out.println("Cannot add additional items to this burger.");
    }

    @Override
    public void addHamburgerAddition4(String additionalItem4, double additionalItem4Price) {
        System.out.println("Cannot add additional items to this burger.");
    }
}
