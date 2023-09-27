
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Stack s = new Stack();

       for(int i = 0; i<3;i++){
           System.out.println("Enter number");
           int num = input.nextInt();
           s.push(num);
       }

        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is: " + s.peek());
        System.out.print("Element present in stack: ");
        s.print();
    }
}