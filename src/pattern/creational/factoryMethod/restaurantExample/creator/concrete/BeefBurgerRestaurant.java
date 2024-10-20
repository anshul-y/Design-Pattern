package pattern.creational.factoryMethod.restaurantExample.creator.concrete;

import pattern.creational.factoryMethod.restaurantExample.creator.Restaurant;
import pattern.creational.factoryMethod.restaurantExample.products.concrete.BeefBurger;
import pattern.creational.factoryMethod.restaurantExample.products.IBurger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public IBurger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }
}
