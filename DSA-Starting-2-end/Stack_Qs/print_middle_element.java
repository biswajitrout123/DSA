package Stack_Qs;

import java.util.Stack;

/**
 * print_middle_element
 */
public class print_middle_element {
    public static void printMiddleElement(Stack<Integer> stk, int count, int size) {

        if (count == size / 2) {
            int middleElement = stk.peek();
            System.out.println("Middle Element of the Stack " + middleElement);
            return;
        }
        stk.pop();
        count++;
        printMiddleElement(stk, count, size);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);

        int count = 0;
        int size = stk.size();

        printMiddleElement(stk, count, size);
    }
}