import java.util.HashMap;
import java.util.Scanner;

public class HandleOne implements Handler {

    @Override
    public void handleIt(HashMap<String, Object> data) {

        try {
            System.out.println("You selected a. \n" +
            "This option calculates the sum of 2 numbers.\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int first = scanner.nextInt();
            System.out.println("Enter second number: ");
            int second = scanner.nextInt();
            System.out.println("\n The sum is: " + (first + second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}