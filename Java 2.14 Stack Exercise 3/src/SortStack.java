import java.util.Stack;

public class SortStack{
    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while (tempStack.empty()){
            stack.push(tempStack.pop());
        }
    }
}