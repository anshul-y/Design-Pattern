package pattern.creational.factoryMethod.restaurantExample.products.concrete;

import pattern.creational.factoryMethod.restaurantExample.products.IBurger;

public class BeefBurger implements IBurger {

    @Override
    public void prepare() {
        // Prepare Beef Burger
        System.out.println("Preparing Beef Burger...");
    }
}
