
// This is code to show Arrays in Java
import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        // Explains what this portion of code does -- Arrays
        System.out.println("This is an excample of writing to an array.");

        // Create an array
        // Basic arrays are fixed size, cannot be added to in size
        String[] arrayL1 = { "List", "Set", "Queue" };

        // Print array list using a for each loop
        for (String i : arrayL1) {
            System.out.println(i);
        }
        System.out.print("\n");

        // Change an item in the array
        arrayL1[2] = "Map";

        // Print the modified array
        for (String i : arrayL1) {
            System.out.println(i);
        }
        System.out.print("\n");

        // If you want to increase or decrease a size of an array
        // it would be better to use an array list
        // Create the ArrayList - it is initially empty
        System.out.println("This is an ArrayList.");
        ArrayList<String> arrayL2 = new ArrayList<String>();

        // Create "items" to be added to the ArrayList
        String item1 = "List";
        String item2 = "Set";
        String item3 = "Queue";

        // Add items to newly created list
        arrayL2.add(item1);
        arrayL2.add(item2);
        arrayL2.add(item3);

        // Print the array list
        for (String i : arrayL2) {
            System.out.println(i);
        }
        System.out.print("\n");

        // Now we can add or remove from the ArrayList
        // by creating new items and then using add or remove
        String newItem1 = "Map";
        String newItem2 = "This is easy!";

        arrayL2.add(newItem1);
        arrayL2.add(newItem2);
        arrayL2.remove(item3);

        // Print the array list with additions
        for (String i : arrayL2) {
            System.out.println(i);
        }

    }
}