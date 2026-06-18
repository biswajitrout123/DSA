package Recursion_DSA;

public class square_of_n_numbe {
    public static int pritnSquare(int i, int n, int sum) {

        if(i > n) {
            return sum;
        }

        return pritnSquare(i + 1, n, sum + i*i);
    }   

    public static void main(String[] args) {
        int n = 4;
        int sum = 0;
        System.out.println(pritnSquare(sum, n, sum));
    }
}