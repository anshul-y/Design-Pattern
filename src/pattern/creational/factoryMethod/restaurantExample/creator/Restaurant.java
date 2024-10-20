package pattern.creational.factoryMethod.restaurantExample.creator;


import pattern.creational.factoryMethod.restaurantExample.products.IBurger;

//we are making this an abstract class so that createBurger method(factory method)
//can be abstract method
public abstract class Restaurant {

    /*
    //the method we are implementing here can
    //only return a single object

    public ???? orderBurger(String request) {
        if ("BEEF".equals(request)) {
            BeefBurger burger = new BeefBurger();
            burger.prepare();
            return burger;
        }else if ("VEGGIE".equals(request)) {
            VeggieBurger burger = new VeggieBurger();
            burger.prepare();
            return burger;
        }
    }
//-------------------------------------------------------------------------------------------------------------
*/

    /*
    //to cope up with above problem, we have to implement a base class Burger.class
    //when things change, we're going to have to open this code and change it(add/delete new burger)
    public Burger orderBurger(String request) {
        Burger burger = null;
        if ("BEEF".equals(request)) {
            burger = new BeefBurger();
        }else if ("VEGGIE".equals(request)) {
            burger = new VeggieBurger();
        }
        burger.prepare();
        return burger;
    }
//-------------------------------------------------------------------------------------------------------------
*/
    /*
    //SIMPLE FACTORY IDIOM
    //to fix this we encapsulate the burger creation in a factory class
    //it isn't a full-fledged official pattern, it is more of an idiom that's commonly used
    //This class is open for modification(Open/Closed). when we add more recipes to our
    //menu, we will have to open this method and change it
    public Burger orderBurger(String request) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;
    }
//-------------------------------------------------------------------------------------------------------------
*/

    // FACTORY METHOD
    public IBurger orderBurger() {
        IBurger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract IBurger createBurger();

}
