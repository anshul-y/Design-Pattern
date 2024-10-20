package pattern.creational.factoryMethod.enemyShipExample;

/**
 * This abstract class represents an enemy ship in a game. It provides methods for setting and getting the ship's name, damage,
 * and for simulating the ship's actions such as displaying, following the hero, and shooting.
 */
public abstract class EnemyShip {

    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;

    /**
     * Returns the name of the enemy ship.
     *
     * @return the name of the enemy ship
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the enemy ship.
     *
     * @param newName the new name of the enemy ship
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Returns the amount of damage the enemy ship can do.
     *
     * @return the amount of damage the enemy ship can do
     */
    public double getDamage() {
        return amtDamage;
    }

    /**
     * Sets the amount of damage the enemy ship can do.
     *
     * @param newDamage the new amount of damage the enemy ship can do
     */
    public void setDamage(double newDamage) {
        amtDamage = newDamage;
    }

    /**
     * Displays a message indicating that the enemy ship is on the screen.
     */
    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    /**
     * Displays a message indicating that the enemy ship is following the hero.
     */
    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    /**
     * Displays a message indicating that the enemy ship is attacking and does damage to the hero.
     */
    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
    }

}
