package com.georgioskachrimanis.javacourse;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // Constructors
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye bread");
    }


    // Setters for additional items.

    public void addHealthyAddition1(String healthyAdditionalItem1, double healthyAdditionalItem1Price) {
        this.healthyExtra1Name = healthyAdditionalItem1;
        this.healthyExtra1Price = healthyAdditionalItem1Price;
    }

    public void addHealthyAddition2(String healthyAdditionalItem2, double healthyAdditionalItem2Price) {
        this.healthyExtra2Name = healthyAdditionalItem2;
        this.healthyExtra2Price = healthyAdditionalItem2Price;
    }

    // Methods

    @Override
    public double itemizeHamburger() {

        double hamburgerPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            System.out.println("You had added: " + this.healthyExtra1Name + " and the extra cost is: "
                    + this.healthyExtra1Price);
            hamburgerPrice += this.healthyExtra1Price;
        }

        if (healthyExtra2Name != null) {
            System.out.println("You had added: " + this.healthyExtra2Name + " and the extra cost is: "
                    + this.healthyExtra2Price);
            hamburgerPrice += this.healthyExtra2Price;
        }

        return hamburgerPrice;
    }


}
