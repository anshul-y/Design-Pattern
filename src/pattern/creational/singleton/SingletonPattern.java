package pattern.creational.singleton;

/**
 * This class represents a Singleton design pattern implementation using eager initialization.
 * The Singleton pattern ensures that only one instance of a class is created and provides a global point of access to it.
 * In this eager initialization approach, the instance of the Singleton class is created at the time of class loading.
 */
class SingletonEager {

    private static SingletonEager instance = new SingletonEager();
    ; //It is initialized during class loading.

    //static {  //It is initialized during class loading.
    //    instance = new SingletonEager();
    //}

    private SingletonEager() {  // Private constructor to prevent instantiation from other classes.
    }

    //Static method to provide global access to the single instance of the SingletonEager class.
    public static SingletonEager getInstance() {
        return instance;
    }
}

/**
 * In this lazy initialization approach, the instance of the Singleton class is created only when the getInstance()
 * method is called for the first time.
 */
class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {   // Private constructor to prevent instantiation from other classes.
    }


    // Static method to provide global access to the single instance of the SingletonLazy class.
    public static SingletonLazy getInstance() {
        if (instance == null) { //If the instance is null, it is created using the new operator.
            instance = new SingletonLazy();
        }
        return instance;
    }
}

/**
 * In this approach, the getInstance() method is synchronized, ensuring that only one thread can access it at a time.
 */
class SingletonSynchronizedMethod {

    private static SingletonSynchronizedMethod instance;    //It is initialized to null and created only when getInstance() is called for the first time.

    private SingletonSynchronizedMethod() { // Private constructor to prevent instantiation from other classes.
    }

    public static synchronized SingletonSynchronizedMethod getInstance() {  //This method is synchronized to ensure thread safety.
        if (instance == null) { //If the instance is null, it is created using the new operator.
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

/**
 * In this approach, the getInstance() method uses double-checked locking to ensure that the instance is only created
 * once, even in a multithreaded environment.
 */
class SingletonSynchronizedBlock {

    private static SingletonSynchronizedBlock instance; //initialized to null and created only when getInstance() is called for the first time.

    private SingletonSynchronizedBlock() {  // Private constructor to prevent instantiation from other classes.
    }

    public static SingletonSynchronizedBlock getInstance() { //This method uses double-checked locking to ensure thread safety.
        if (instance == null) {
            synchronized (SingletonSynchronizedBlock.class) {
                if (instance == null) {
                    instance = new SingletonSynchronizedBlock();
                }
            }
        }
        return instance;
    }
}

/**
 * This class represents a Singleton design pattern implementation.
 * The instance is created using double-checked locking to ensure thread safety.
 */
class Singleton {

    /**
     * The 'volatile' keyword is used to ensure that changes to the instance variable are immediately visible to all
     * threads.
     */
    private static volatile Singleton instance;

    /**
     * A string data field to hold any additional data associated with the Singleton instance.
     */
    private String data;

    /**
     * Private constructor to prevent instantiation from other classes.
     *
     * @param data The data to be associated with the Singleton instance.
     */
    private Singleton(String data) {
        this.data = data;
    }

    /**
     * Static method to provide global access to the single instance of the Singleton class.
     * If the instance is null, it is created using the new operator inside a synchronized block.
     * This method uses double-checked locking to ensure thread safety.
     * <p>
     * The 'volatile' keyword is used for the 'instance' field to ensure that changes to the instance variable are
     * immediately visible to all threads.
     * The 'result' variable is used to store a reference to the Singleton instance before it is created.
     * This variable is introduced to optimize the performance of the double-checked locking mechanism.
     *
     * @param data The data to be associated with the Singleton instance.
     * @return The single instance of the Singleton class.
     */
    public static Singleton getInstance(String data) {
        // Store a reference to the instance before it is created
        Singleton result = instance;

        // Check if the instance is null
        if (result == null) {
            // If the instance is null, synchronize access to create the instance
            synchronized (Singleton.class) {
                // Check if the instance is still null inside the synchronized block
                // This is to ensure that only one thread creates the instance
                result = instance;
                if (result == null) {
                    // If the instance is still null, create the instance
                    instance = result = new Singleton(data);
                }
            }
        }

        // Return the instance
        return result;
    }
}

public class SingletonPattern {

    public static void main(String[] args) {
        SingletonEager eagerInstance = SingletonEager.getInstance();
        System.out.println(eagerInstance);
        SingletonEager eagerInstance1 = SingletonEager.getInstance();
        System.out.println(eagerInstance1);

        SingletonLazy lazyInstance = SingletonLazy.getInstance();
        System.out.println(lazyInstance);
        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        System.out.println(lazyInstance1);

        SingletonSynchronizedMethod syncMethodInstance = SingletonSynchronizedMethod.getInstance();
        System.out.println(syncMethodInstance);
        SingletonSynchronizedMethod syncMethodInstance1 = SingletonSynchronizedMethod.getInstance();
        System.out.println(syncMethodInstance1);

        SingletonSynchronizedBlock syncBlockInstance = SingletonSynchronizedBlock.getInstance();
        System.out.println(syncBlockInstance);
        SingletonSynchronizedBlock syncBlockInstance1 = SingletonSynchronizedBlock.getInstance();
        System.out.println(syncBlockInstance1);


    }
}
