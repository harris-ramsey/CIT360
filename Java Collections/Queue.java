import java.util.*;


public class Queue {

    public static void main(String[] args) {

        System.out.println("This will show a Priority Queue being used.");
        
        // Create a queue
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        que1.add(1);
        que1.add(2);
        que1.add(5);
        que1.add(9);
        que1.add(0);

        Iterator itr = que1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.print(que1);
        System.out.println("\n");

        // You can use poll() to find and remove the head
        System.out.println(que1.poll());
        System.out.println("\n");
        System.out.print(que1);

        System.out.println(que1.poll());
        System.out.println("\n");
        System.out.print(que1);

        System.out.println(que1.poll());
        System.out.println("\n");
        System.out.print(que1);

        // From running the above code we can see that
        // PriorityQueue has not kept a particular order
        // instead it only makes an effort to keep the
        // lowest priority of element at the head of the queue.
        // https://www.java67.com/2015/07/how-to-use-priorityqueue-in-java-example.html


    }
}