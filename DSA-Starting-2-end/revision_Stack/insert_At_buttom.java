package revision_Stack;

import java.util.Stack;

public class insert_At_buttom {
    public static void insertButtom(Stack<Integer> st, int n) {
        if (st.isEmpty()) {
            st.push(n);
            return;
        }
        int topValue = st.pop();
        insertButtom(st, n);
        st.push(topValue);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int n = 60;
        insertButtom(st, n);
        System.out.println(st);
    }
}
