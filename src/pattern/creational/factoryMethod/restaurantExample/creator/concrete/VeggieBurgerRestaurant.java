package pattern.creational.factoryMethod.restaurantExample.creator.concrete;

import pattern.creational.factoryMethod.restaurantExample.creator.Restaurant;
import pattern.creational.factoryMethod.restaurantExample.products.IBurger;
import pattern.creational.factoryMethod.restaurantExample.products.concrete.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public IBurger createBurger() {
        System.out.println("Creating Veggie Burger...");
        return new VeggieBurger();
    }
}