package pattern.creational.singleton.Scrabble;

import java.util.LinkedList;

/**
 * This class implements Runnable interface to simulate a thread that retrieves tiles from a Singleton instance.
 * The Singleton class, {@link Singleton}, is used to manage the Scrabble game's letter pool.
 */
public class GetTheTiles implements Runnable {

    /**
     * This method is called when the thread is started.
     * It demonstrates the usage of Singleton to retrieve tiles for a Scrabble game.
     */
    @Override
    public void run(){

        // How you create a new instance of Singleton
        Singleton newInstance = Singleton.getInstance();

        // Get unique id for instance object
        // This is used to verify that the same instance is being used across multiple threads.
        System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));

        // Get all the letters stored in the List
        // This method retrieves all the available letters from the Singleton instance.
        System.out.println("Letters List: "+newInstance.getLetterList());

        // Retrieve 7 tiles for Player 1
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        // Display the tiles retrieved for Player 1
        System.out.println("Player 1: " + playerOneTiles);

        // Log a message indicating that the tiles have been retrieved
        System.out.println("Got Tiles");
    }

}
