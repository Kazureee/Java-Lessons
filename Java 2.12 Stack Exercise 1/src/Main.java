// This is the other method to do the first stack exercise
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.offer("2");
        l.offer("4");
        l.offer("6");
        l.offer("8");
        l.offer("10");

        System.out.println("Linkedlist: " + l);

        l.offerFirst("0");
        l.add(1,"1");
        System.out.println("Add 0,1: " + l);

        l.add(7, "11");
        l.offerLast("12");
        System.out.println("Add 11 and 12 to the last: " + l);

        l.add(3, "3");
        System.out.println("Add 3 between 1 and 2: " + l);
        }
    }
