package String;

public class Count_Vowels_and_Consonants {
    public static void main(String[] args) {
        String str = "biswajit";
        int n = str.length();

        int vowels = 0;
        int consonants = 0;

        // String vowels = "A, E, I, O, U";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}