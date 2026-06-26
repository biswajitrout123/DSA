package Recursion_DSA;

import java.util.ArrayList;

public class generateParenthesis {
    public static void generate(int n, int left, int right, String curr, ArrayList<String> result) {
        if(curr.length() == 2 * n) {
            result.add(curr);
            return;
        }
        if(left < n) {
            generate(n, left + 1, right, curr + "(", result);
        }
        if(right < left) {
            generate(n, left, right + 1, curr + ")", result);
        }


    }
    public static void main(String[] args) {
        int n  = 3;
        ArrayList<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);        
        System.out.println(result);
    }
}