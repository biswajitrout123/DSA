package Stack_Qs;

import java.util.Stack;

public class insertElementInSortedStack {
    public static void sortedInserted(Stack<Integer> st, int x) {
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        if(top < x) {
            // Recursively check remaining stack
            sortedInserted(st, x);

            // Recursively return time push
            st.push(top);
        }
        else {
            st.push(top);
            st.push(x);    
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        int x = 0;

        System.out.println("Before: " + st);
        sortedInserted(st, x);
        System.out.println("After: " + st);
    }
}
