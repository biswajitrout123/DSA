package Placements.Strings_All;

public class Find_First_Repeting_Chararacter {

    public static void main(String[] args) {
        // Find First Repetating Character
        String str = "programming";
        boolean[] seen = new boolean[256];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(seen[ch]) {
                System.out.println("First Repeating Character: " + ch);
                return;
            }
            seen[ch] = true;
        }
        System.out.println("No Repeating Character");        
    }
}