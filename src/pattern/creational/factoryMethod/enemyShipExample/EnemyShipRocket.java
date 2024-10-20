package pattern.creational.factoryMethod.enemyShipExample;

/**
 * This class represents a specific type of enemy ship, specifically a rocket-powered enemy ship.
 * It extends the base {@link EnemyShip} class and overrides the constructor to set the name and damage to the ship.
 */
public class EnemyShipRocket extends EnemyShip {

    /**
     * Constructs a new Rocket Enemy Ship with the specified name and damage.
     */
    public EnemyShipRocket(){
        setName("Rocket Enemy Ship");
        setDamage(10.0);
    }

}
