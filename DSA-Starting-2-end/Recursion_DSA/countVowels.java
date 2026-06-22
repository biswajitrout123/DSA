package Recursion_DSA;

public class countVowels {
    public static int printVowels(String str, int idx, int count) {
        if (idx == str.length()) {
            return count;
        }
        if (str.charAt(idx) == 'a' || str.charAt(idx) == 'e' || str.charAt(idx) == 'i' || str.charAt(idx) == 'o'
                || str.charAt(idx) == 'u') {
            count = count + 1;
        }
        return printVowels(str, idx+1, count);
    }

    public static void main(String[] args) {
        String str = "Biswajit";
        int count = printVowels(str, 0, 0);
        System.out.println(count);
    }
}