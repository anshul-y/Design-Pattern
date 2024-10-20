package pattern.creational.factoryMethod.restaurantExample.products.concrete;

import pattern.creational.factoryMethod.restaurantExample.products.IBurger;

public class VeggieBurger implements IBurger {

    @Override
    public void prepare() {
        // Prepare Veggie Burger
        System.out.println("Preparing Veggie Burger...");
    }
}
