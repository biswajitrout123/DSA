package Placements.Strings_All;

public class Replace_all_spaces_with_Percentage20 {

    public static void main(String[] args) {
        // Replace all spaces with %20
        String str = "hello world java";
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ' ') {
                result = result + "%20";
            }
            else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}