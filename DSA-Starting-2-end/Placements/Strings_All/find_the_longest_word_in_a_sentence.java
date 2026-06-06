package Placements.Strings_All;

public class find_the_longest_word_in_a_sentence {
    public static void main(String[] args) {
        
        // find the longest word in a sentence
        String str = "I love programming in Java";

        String[] words = str.split(" ");
        String maxWord = "";

        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        System.out.println("Longest word: " + maxWord);
        
        
    }
}