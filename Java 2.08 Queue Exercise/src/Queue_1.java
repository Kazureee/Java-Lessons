import java.util.*;
public class Queue_1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //add element
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        //print the queue
        System.out.println("Queue: " + queue);

        //remove the element at the front queue
        String front = queue.remove();
        System.out.println("Remove element: " + front);

        //print the updated queue
        System.out.println("Queue after removal: " + queue);

        //add another element to the queue
        queue.add("date");

        //peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked Element: " + peeked);

        //print the update queue
        System.out.println("Queue after peek: " + queue);
    }
}