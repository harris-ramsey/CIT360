import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.HashMap;

public class UserListDemo {

    public static void main(String[] argv) {
        System.out.println("This program accesses a user list and " +
        "allows updates to be made.");

        Thread t1 = new Thread(new ViewList());
        ExecutorService execute = Executors.newCachedThreadPool();
        //ThreadPoolExecutor pool = (ThreadPoolExecutor) execute;


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Press '1' to view current list, or '2' to make additions: ");
            int input = scanner.nextInt();

            if (input == 1) {
                execute.submit(new ViewList());
                execute.shutdown();
                t1.start();
            }

           /* Controller control = new Controller();
            control.mapCommand("a", new ViewList());
            //control.mapCommand("b", new AddUserController());

            HashMap selection = new HashMap();
            control.handleReq(input, selection);
            //System.out.print(input);*/
        }
    }
}