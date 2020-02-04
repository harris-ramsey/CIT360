import java.util.*;

public class Map {

    public static void main(String[] args) {

        System.out.println("This is an example of the Map interface being used in Java.");

        // Lets create a map of some state flowers
        HashMap<Integer, String> flower = new HashMap<Integer,String>();
        flower.put(1, "Illinois - Violet");
        flower.put(2, "Texas - Bluebonnet");
        flower.put(3, "California - California Poppy");

        // You could do a normal system print but your output
        // might not be favorable - see below
        System.out.print(flower);
        System.out.println("\n");

        // To print in a better format, we can use a for loop
        // which uses the get() method to get each item at a time
        for (int i = 1; i <= 3; i++) {
            String result = (String)flower.get(i);
            System.out.println(result);
        }

        System.out.println("\n");

        // You can use the remove() method to remove a single item
        // or the clear() method to remove all items

        flower.remove(2);

        // Quick print to show that key item 2 has been removed (Texas)
        System.out.print(flower);

        // some info provided by https://www.codebyamir.com/blog/how-to-use-a-map-in-java
        

    }
}