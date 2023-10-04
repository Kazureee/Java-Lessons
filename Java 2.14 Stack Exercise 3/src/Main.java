import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Input elements");

        while (!input.hasNext("exit")){
            if(input.hasNextInt()){
                stack.push(input.nextInt());
            }
            else {
                input.next();
                System.out.println("Invalid please type exit correctly");
            }
        }
        System.out.println("Original Element: " + stack);
        List<Integer> sortList = new ArrayList<>(stack);
        System.out.println("Sorted element: " + sortList);
    }
}