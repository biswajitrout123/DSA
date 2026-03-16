package Placements.Strings_All;

public class Count_Vowels_and_Consonantas_In_String {

    public static void main(String[] args) {
        // Count_Vowels_and_Consonantas_In_String
        String str = "hello world";
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels = vowels + 1;
            }
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                consonants = consonants + 1;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);


    }
}