package pattern.creational.factoryMethod.enemyShipExample;

/**
 * This class represents a specific type of enemy ship, specifically a UFO.
 * It extends the base {@link EnemyShip} class and overrides the constructor.
 */
public class EnemyShipUFO extends EnemyShip {

    /**
     * Constructs a new UFO enemy ship with default values.
     *
     * <p>The UFO enemy ship is named "UFO Enemy Ship" and has a damage value of 20.0.
     * These values can be modified using the {@link #setName(String)} and {@link #setDamage(double)} methods.
     */
    public EnemyShipUFO(){
        setName("UFO Enemy Ship");
        setDamage(20.0);
    }

}