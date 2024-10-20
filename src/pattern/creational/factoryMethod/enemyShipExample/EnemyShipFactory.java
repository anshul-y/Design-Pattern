package pattern.creational.factoryMethod.enemyShipExample;

/**
 * This class is a factory for creating different types of enemy ships.
 * The factory encapsulates the ship creation logic, allowing for a single
 * point of modification if needed.
 */
public class EnemyShipFactory {

    /**
     * Creates a new enemy ship based on the provided ship type.
     *
     * @param newShipType A string representing the type of enemy ship to create.
     *                    The supported types are:
     *                    - "U": Creates an {@link EnemyShipUFO}
     *                    - "R": Creates an {@link EnemyShipRocket}
     *                    - "B": Creates an {@link EnemyShipBigUFO}
     *                    Any other value will result in a null return.
     *
     * @return A new enemy ship of the specified type, or null if the type is not supported.
     */
    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        switch (newShipType) {
            case "U":
                return new EnemyShipUFO();
            case "R":
                return new EnemyShipRocket();
            case "B":
                return new EnemyShipBigUFO();
            default:
                return null;
        }
    }
}
