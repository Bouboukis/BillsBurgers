package com.georgioskachrimanis.javacourse;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;
    // Constructors
    public Hamburger(String hamburgerName, String meat, double price, String breadType) {
        this.name = hamburgerName;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadType;
    }

    // Getters and Setters for additional items.

    public void addHamburgerAddition1(String additionalItem1, double additionalItem1Price) {
        this.addition1Name = additionalItem1;
        this.addition1Price = additionalItem1Price;
    }

    public void addHamburgerAddition2(String additionalItem2, double additionalItem2Price) {
        this.addition2Name = additionalItem2;
        this.addition2Price = additionalItem2Price;
    }

    public void addHamburgerAddition3(String additionalItem3, double additionalItem3Price) {
        this.addition3Name = additionalItem3;
        this.addition3Price = additionalItem3Price;
    }
    public void addHamburgerAddition4(String additionalItem4, double additionalItem4Price) {
        this.addition4Name = additionalItem4;
        this.addition4Price = additionalItem4Price;
    }

    // Methods

    public double itemizeHamburger() {

        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with "
                + this.meat + ", costs:" + this.price);

        if (addition1Name != null) {
            System.out.println("You had added: " + this.addition1Name + " and the extra cost is: "
                    + this.addition1Price);
            hamburgerPrice += this.addition1Price;
        }

        if (addition2Name != null) {
            System.out.println("You had added: " + this.addition2Name + " and the extra cost is: "
                    + this.addition2Price);
            hamburgerPrice += this.addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("You had added: " + this.addition3Name + " and the extra cost is: "
                    + this.addition3Price);
            hamburgerPrice += this.addition3Price;
        }
        if (addition4Name != null) {
            System.out.println("You had added: " + this.addition4Name + " and the extra cost is: "
                    + this.addition4Price);
            hamburgerPrice += this.addition4Price;
        }

        return  hamburgerPrice;

    }

}
