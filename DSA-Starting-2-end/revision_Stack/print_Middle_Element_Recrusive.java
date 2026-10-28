package revision_Stack;

import java.util.Stack;

public class print_Middle_Element_Recrusive {
    public static void printMiddle(Stack<Integer> st, int count, int size) {
        if(count == size/2) {
            System.out.println(st.peek());
            return ;
        }
        st.pop();
        count++;
        printMiddle(st, count, size);


    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(60);

        int count = 0;
        int size = st.size();
        printMiddle(st, count, size);





    }
}
