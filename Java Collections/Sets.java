import java.util.*;

public class Sets {

    public static void main(String[] args) {

        System.out.println("This will show how a Set is used in Java.");

        // Create a set
        Set<String> set1 = new TreeSet<>();

        // Add items to new set.
        set1.add("This");
        set1.add("is");
        set1.add("my");
        set1.add("set");

        // Print the set
        System.out.print(set1);
        System.out.print("\n");

        // You cann add to sets, but sets do not allow duplicates
        set1.add("This");
        set1.add("is");
        set1.add("my");
        set1.add("new");
        set1.add("additions");

        // Print modified set
        System.out.print(set1);
        System.out.print("\n");
        
        // You will notice the printed set is not
        // in the expected order as TreeSet implements
        // items in order by their value

        // Lets use a LinkedHashSet to keep the order in which we add
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        // Print the object numbers
        System.out.print(numbers);
        System.out.print("\n");

        // Use just a HashedSet if you'd like the items to be
        // put in order
        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(4);
        numbers2.add(2);
        numbers2.add(1);
        numbers2.add(3);

        // Print the HashSet
        System.out.print(numbers2);
        System.out.print("\n");

    }
}