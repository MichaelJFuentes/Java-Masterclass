package RandomThings.JavaTwo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Stack;

public class StackReversal {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        printStack(stack);
        System.out.println();
        reveresStack(stack);
        printStack(stack);

        //System.out.println(stack.peek());

    }

    public static void printStack(Stack<Integer> stack) {
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.elementAt(i));
        }
        System.out.println();
    }

    public static void reveresStack(Stack<Integer> stackIn) {
        Stack<Integer> tempOne = new Stack<>();
        while (!stackIn.empty()) {
            int temp = stackIn.pop();
            tempOne.add(temp);
        }
        Stack<Integer> tempTwo   = new Stack<>();
        while (!tempOne.empty()) {
            tempTwo.add(tempOne.pop());
        }
        while (!tempTwo.isEmpty()) {
            stackIn.add(tempTwo.pop());
        }

    }
}
