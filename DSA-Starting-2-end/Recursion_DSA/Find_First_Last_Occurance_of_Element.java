public class Find_First_Last_Occurance_of_Element {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx, char elem) {
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == elem) {
            if(first == -1) {
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, elem);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        
        findOccurance(str, 0, 'a');        
    }
}
