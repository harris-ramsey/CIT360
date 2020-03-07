import java.util.*;

/**
 * Runnable process to be used by Thread process
 */
public class Running implements Runnable {
    private String name;
    private int time;
    private Random rand = new Random();

    /**
     * Setting defaults
     * @param name
     */
    public Running(String name) {
        this.name = name;
        this.time = rand.nextInt(999);
    }

    /**
     * The main code to be executed for the Thread process
     */
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d \n", this.name, this.time);
            Thread.sleep(this.time);
            System.out.printf("%s is done. \n", this.name);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}