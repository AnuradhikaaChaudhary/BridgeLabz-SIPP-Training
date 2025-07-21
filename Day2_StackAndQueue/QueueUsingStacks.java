package Day2_StackAndQueue;
import java.util.*;

public class QueueUsingStacks {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    
    public void enqueue(int x) {
        input.push(x);
    }

    
    public int dequeue() {
        if (output.isEmpty()) {
            if (input.isEmpty()) throw new RuntimeException("Queue is empty");
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue()); 
        q.enqueue(40);
        System.out.println(q.dequeue()); 
    }
}
