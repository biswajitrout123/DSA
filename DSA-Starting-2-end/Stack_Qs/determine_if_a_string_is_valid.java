package Stack_Qs;

import java.util.Stack;

public class determine_if_a_string_is_valid {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            // a and b -> push

            if (ch == 'a' || ch == 'b') {
                st.push(ch);
            }
            // c -> check whether top two are "ab"
            else {
                if(st.size() < 2) {
                    return false;
                }
                char top = st.pop();
                char below = st.pop();
                if(below == 'a' && top == 'b') {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "aabcbc";
        System.out.println(isValid(s));

    }
}
