package IBM;

public class q_1HCF_of_two_numbers_without_recursion {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("HCF is: " + a);
    }
}
