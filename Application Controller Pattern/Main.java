import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please make a selection of a or b: ");
        String input = scanner.next();

        Controller control = new Controller();
        control.mapCommand("a", new HandleOne());
        control.mapCommand("b", new HandleTwo());

        HashMap selection = new HashMap();
        control.handleReq(input, selection);
    }
}