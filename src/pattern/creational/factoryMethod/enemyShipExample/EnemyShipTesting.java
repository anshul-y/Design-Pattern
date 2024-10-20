package pattern.creational.factoryMethod.enemyShipExample;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @description This class is used for testing the functionality of different types of enemy ships.
 * It demonstrates the usage of both traditional object instantiation and dynamic object creation using a factory pattern.
 *
 * @author Anshul
 * @version 1.0
 * @since 2024-10-20
 */
public class EnemyShipTesting {

    public static void main(String[] args){

         /*
         *Old way of creating objects
         *When we use new we are not being dynamic
         */
        EnemyShip ufoShip = new EnemyShipUFO();
        doStuffEnemy(ufoShip);
        System.out.println("");
        // --------------------------------------------------------------------------------------------------

        // This allows me to make the program more dynamic
        // It doesn't close the code from being modified
        // and that is bad!
        Scanner userInput = new Scanner(System.in);
        EnemyShip theEnemy = null;
        String enemyShipOption = "";
        System.out.print("What type of ship? (U or R) ");
        if (userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }
        if (Objects.equals(enemyShipOption, "U")){
            theEnemy = new EnemyShipUFO();
        } else
        if (Objects.equals(enemyShipOption, "R")){
            theEnemy = new EnemyShipRocket();
        } else {
            theEnemy = new EnemyShipBigUFO();
        }
        doStuffEnemy(theEnemy);
        // ------------------------------------------------------------------------------------------------

        EnemyShipFactory shipFactory = new EnemyShipFactory(); // Create the factory object
        EnemyShip theEnemyFactory = null; // Enemy ship object
        Scanner userInputFactory = new Scanner(System.in);
        System.out.print("What type of ship? (U / R / B) ");
        if (userInputFactory.hasNextLine()){
            String typeOfShip = userInputFactory.nextLine();
            theEnemyFactory = shipFactory.makeEnemyShip(typeOfShip);
            if(theEnemyFactory != null){
                doStuffEnemy(theEnemyFactory);
            } else {
                System.out.print("Please enter U, R, or B next time");
            }
        }
    }

    /**
     * Executes methods of the super class (EnemyShip) on the given enemy ship object.
     *
     * @param anEnemyShip The enemy ship object on which the methods will be executed.
     */
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}
