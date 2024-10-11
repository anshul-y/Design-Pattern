package pattern.creational.singleton.Scrabble;

/**
 * This class demonstrates the usage of Singleton pattern in a multithreaded environment.
 * It creates two instances of the Runnable interface, GetTheTiles, and executes them in separate threads.
 *
 */
public class ScrabbleTestThreads {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command line arguments. Not used in this program.
     */
    public static void main(String[] args) {

        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds
        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        // Call for the code in the method run to execute
        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

    }
}