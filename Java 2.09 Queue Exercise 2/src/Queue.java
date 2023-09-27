import java.util.*;
public class Queue {

    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;
    }
    boolean isFull(){
        if (front == 0 && rear == SIZE -1){
            return true;
        }
        return false;
    }
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }
    int deQueue(){
        int element;
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return (-1);
        }
        else {
            element = items[front];
            if(front >= rear){
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it.*/
            else {
                front++;
            }
            System.out.println("Delete -> "+element);
            return (element);
        }
    }

    void display() {
        //Function to display elements of Queue
        int i;
        if(isEmpty()){
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index -> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index -> " + rear);
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner input = new Scanner(System.in);
        //deQueue is not on empty queue
        q.deQueue();
        for (int i = 0; i < 6; i++){
            System.out.println("Enter number");
            int num = input.nextInt();
            q.enQueue(num);
        }
        q.display();
        q.deQueue();
        q.display();
    }
}
