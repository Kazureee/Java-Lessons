public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop()
    {
        if (top < 0){
            System.out.println("Stact Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
    int peek()
    {
        if (top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return  x;
        }
    }
    void print(){
        for(int i = top; i>-1; i--){
            System.out.print(" " + a[i]);
        }
    }
}
