package Stack_Qs;

import java.util.Stack;

public class Minimum_Add_to_Make_Parentheses_Valid {
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int addition = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) {
                    addition++;
                }
                else {
                    st.pop();
                }
            }
        }

        int finalAns = addition + st.size();
        return finalAns;
    }
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));        
    }
}
