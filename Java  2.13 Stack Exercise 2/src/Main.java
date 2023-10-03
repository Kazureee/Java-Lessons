import java.util.*;

public class Main {
    public static void main(String[] args) {
    Stack<String> s = new Stack<>();
    Stack<String> tempStack = new Stack<>();
    Scanner input = new Scanner(System.in);

        System.out.println("Initialize a stack:");
        System.out.println("Is the Stack Empty?: " + s.empty());

        System.out.println("Input some elements: ");

        while(!input.hasNext("exit")){
            if(input.hasNextInt()){
                s.push(input.next());
            }
            else{
                input.next();
                System.out.println("invalid");
            }
        }
        System.out.println("Element on the stock: " + s);

        while(!s.isEmpty()) {
            tempStack.push(s.pop());
        }
        System.out.println("Top element: " + tempStack.peek());
        tempStack.pop();
        tempStack.pop();

        while(!tempStack.isEmpty()){
            s.push(tempStack.pop());
        }
        System.out.println(s);

        System.out.println("The top element after popping is: " + s.peek());

        System.out.println("Is the stack empty: "+s.isEmpty());


    }
}