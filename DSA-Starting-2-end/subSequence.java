/**
 * subSequence
 */
public class subSequence {
    static boolean isSubSequence(String s1, String s2) {
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;

        }
        return i == s1.length();
    }

    public static void main(String[] args) {
        String s1 = "gks";
        String s2 = "geeksforgeeks";
        System.out.println(isSubSequence(s1, s2));
    }
}