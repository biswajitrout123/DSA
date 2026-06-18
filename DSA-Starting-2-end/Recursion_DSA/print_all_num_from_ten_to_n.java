package Recursion_DSA;

public class print_all_num_from_ten_to_n {
    public static void printNum(int idx, int n) {
        if(idx > n){
            return;
        }
        System.out.print(idx + " ");
        printNum(idx + 1, n);        
    }
    public static void main(String[] args) {
        // WHERE N WILL BE GREATER THAN 10
        int n = 20;
        printNum(11, n);
    }
}