import java.util.*;

/**
 * Threading class to be used to show Threads
 */
public class Threading {

    /**
     * Main method for Threading class
     * @param args
     */
    public static void main(String[] args) {

        // Create threads that passes a reference to a runnable process
        Thread t1 = new Thread(new Running("Thread-1"));
        Thread t2 = new Thread(new Running("Thread-2"));
        Thread t3 = new Thread(new Running("Thread-3"));

        // In order to start the threads, we need to use the start() method
        t1.start();
        t2.start();
        t3.start();
    }
}