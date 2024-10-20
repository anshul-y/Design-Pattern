package pattern.creational.factoryMethod.restaurantExample;

import pattern.creational.factoryMethod.restaurantExample.products.IBurger;
import pattern.creational.factoryMethod.restaurantExample.creator.concrete.BeefBurgerRestaurant;
import pattern.creational.factoryMethod.restaurantExample.creator.Restaurant;
import pattern.creational.factoryMethod.restaurantExample.creator.concrete.VeggieBurgerRestaurant;

public class RestaurantClient {
    public static void main(String[] args) {

        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        IBurger veggieBurger = veggieBurgerRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        IBurger beefBurger = beefBurgerRestaurant.orderBurger();

    }
}
