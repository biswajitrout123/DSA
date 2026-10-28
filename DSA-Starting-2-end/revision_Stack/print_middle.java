package revision_Stack;

import java.util.Stack;

public class print_middle {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(60);

        int size = st.size();
        int count = 0;
        while (!st.isEmpty() && count < size / 2) {
            st.pop();
            count++;
        }
        System.out.println(st.peek());

    }
}
