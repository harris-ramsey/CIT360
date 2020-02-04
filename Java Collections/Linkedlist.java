import java.util.*;

public class Linkedlist {

    public static void main(String[] args) {

        System.out.println("This is a tiny program using a LinkedList.");

        // Lets create our list
        LinkedList<String> list1 = new LinkedList<String>();
        // Lets add to this list using the add() method
        list1.add("This");
        list1.add("is");
        list1.add("my");
        list1.add("my");
        list1.add("first");
        list1.add("list.");

        System.out.println(list1);

        // LinkedLists allow for duplicates
        // Lets remove the duplicate

        list1.remove("my"); // you could also specificy the position instead of "my"

        System.out.println(list1);

        // Lets add that extra "my" back into the list
        list1.add(3, "my");
        // Lets remove that remove the other one with its specific location
        list1.remove(2);

        System.out.println(list1);


        // Lets create a new LinkedList using an external class
        // some info provided by https://www.javatpoint.com/java-linkedlist
        LinkedList<Sodas> list2 = new LinkedList<Sodas>();

        // Adding items to the list2 object using the class Sodas
        list2.add(new Sodas("Coke", "Pibb Xtra"));
        list2.add(new Sodas("Coke", "Vanilla Coke"));
        list2.add(new Sodas("Pepsi", "Cherry Pepsi"));

        // For each loop to print said items
        for (Sodas soda : list2) {
            System.out.println(soda);
        }
    }
}