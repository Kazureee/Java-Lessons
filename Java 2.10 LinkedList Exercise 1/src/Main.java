import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();

        /* Linkedlist
        l.push("A");
        l.push("B");
        l.push("C");
        l.push("D");
        l.push("F");
        l.pop(); */

        //Queue
        l.offer("A");
        l.offer("B");
        l.offer("C");
        l.offer("D");
        l.offer("F");
        //l.poll();

        l.add(4, "E");
        l.remove("E");

        System.out.println(l.indexOf("F"));
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        l.addFirst("0");
        l.addLast("G");

        String first = l.removeFirst();
        String last = l.removeLast();

        
        System.out.println(l);
        }
    }
