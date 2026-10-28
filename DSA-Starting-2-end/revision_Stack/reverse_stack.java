package revision_Stack;

import java.util.Stack;

public class reverse_stack {
    public static void insertButtom(Stack<Integer> st, int n) {
        if (st.isEmpty()) {
            st.push(n);
            return;
        }
        int topValue = st.pop();
        insertButtom(st, n);
        st.push(topValue);
    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int topValue = st.pop();
        reverseStack(st);
        insertButtom(st, topValue);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);

        reverseStack(st);
        System.out.println(st);
    }
}
