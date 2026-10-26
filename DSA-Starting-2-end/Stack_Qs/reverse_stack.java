package Stack_Qs;

import java.util.Stack;

public class reverse_stack {
    public static void insertAtButtom(Stack<Integer> stk, int x) {
        if(stk.isEmpty()) {
            stk.push(x);
            return;
        }
        int temp = stk.pop();
        insertAtButtom(stk, x);
        stk.push(temp);
    }

    public static void reverseStack(Stack<Integer> stk) {
        if(stk.isEmpty()) {
            return;
        }
        int temp = stk.pop();
        reverseStack(stk);
        insertAtButtom(stk, temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        int x = 50;

        insertAtButtom(stk, x);
        System.out.println(stk);

        reverseStack(stk);
        System.out.println(stk);
    }
}