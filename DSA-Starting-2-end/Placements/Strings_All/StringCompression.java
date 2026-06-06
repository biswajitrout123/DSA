package Placements.Strings_All;

public class StringCompression {
    public static String compress(String str) {
        if(str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
            else {
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        String result = sb.toString();
        return result.length() < str.length() ? result : str;

    }
    public static void main(String[] args) {
        // String Compression
        System.out.println(compress("aaabbccc"));
    }
}
