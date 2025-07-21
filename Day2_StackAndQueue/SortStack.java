package Day2_StackAndQueue;

import java.util.Stack;

public class SortStack {

    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertSorted(stack, top);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
        } else {
            int temp = stack.pop();
            insertSorted(stack, value);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3); s.push(1); s.push(4); s.push(2);

        sort(s);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
