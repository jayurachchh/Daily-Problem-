import java.util.ArrayList;
public class Secondprogram 
{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);

        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());

        minStack.pop();
        System.out.println("After popping:");
        System.out.println("Top element: " + minStack.top());
        System.out.println("Minimum element: " + minStack.getMin());
    }
}

class MinStack {
    private ArrayList<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        if (stack.size() == 0) {
            stack.add(new int[] { val, val });
        } else {
            int min = getMin();
            stack.add(new int[] { val, Math.min(min, val) });
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1)[0];
        }
        return -1;
    }

    public int getMin() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1)[1];
        }
        return -1;
    }

    void printStack() {
        for (int[] entry : stack) {
            System.out.println("Value: " + entry[0] + ", Min: " + entry[1]);
        }
    }

}

