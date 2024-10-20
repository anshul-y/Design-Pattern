package pattern.creational.factoryMethod.enemyShipExample;

/**
 * This class represents a specific type of enemy ship, specifically a Big UFO.
 * It extends the functionality of the EnemyShipUFO class.
 */
public class EnemyShipBigUFO extends EnemyShipUFO {

    /**
     * Constructor for the EnemyShipBigUFO class.
     * Initializes the name and damage attributes of the Big UFO enemy ship.
     */
    public EnemyShipBigUFO(){
        setName("Big UFO Enemy Ship");
        setDamage(40.0);
    }

}