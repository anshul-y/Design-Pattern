package pattern.creational.factoryMethod.restaurantExample.creator;

import pattern.creational.factoryMethod.restaurantExample.products.concrete.BeefBurger;
import pattern.creational.factoryMethod.restaurantExample.products.IBurger;
import pattern.creational.factoryMethod.restaurantExample.products.concrete.VeggieBurger;

public class SimpleBurgerFactory {

    //this is a class whose sole responsibility is creating burgers, it's a burger factory
    //this code is nicely separated from the rest of the restaurant code(Single Responsibility)
    //But this class is open for modification(Open/Closed). when we add more recipes to our
    //menu, we will have to open this method and change it
    public IBurger createBurger(String request) {
        IBurger burger = null;
        if ("BEEF".equals(request)) {
            burger = new BeefBurger();
        }else if ("VEGGIE".equals(request)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}
