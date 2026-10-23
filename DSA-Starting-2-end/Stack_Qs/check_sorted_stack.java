package Stack_Qs;

import java.util.Stack;

/**
 * check_sorted_stack
 */
public class check_sorted_stack {

    public static boolean isSorted(Stack<Integer> st) {

        // Base case
        if (st.size() <= 1) {
            return true;
        }

        // Take top element
        int top = st.pop();

        // Element below top
        int below = st.peek();

        // Check current pair
        boolean current = top <= below;

        // Recursively check remaining stack
        boolean remaining = isSorted(st);

        // Restore stack
        st.push(top);

        return current && remaining;
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // Top -> 1, 2, 3, 4, 5
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println("Stack: " + st);

        boolean ans = isSorted(st);

        System.out.println("Is Stack Sorted? " + ans);

        // Check that original stack is restored
        System.out.println("Stack after function: " + st);
    }
}