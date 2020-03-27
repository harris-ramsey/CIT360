import java.util.HashMap;
import java.util.Scanner;

public class HandleTwo implements Handler {

    @Override
    public void handleIt(HashMap<String, Object> data) {

        try {
            System.out.println("You select 2. \n" + 
            "This option finds the area of a rectangle.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the length (no decimals): ");
            int side = scanner.nextInt();
            System.out.println("What is the height (no decimals): ");
            int height = scanner.nextInt();
            System.out.print("The area is: " + (side * height));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}