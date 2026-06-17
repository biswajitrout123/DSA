public class factorial {
    public static int printFact(int n) {
        if(n == 0) {
            return 1;
        }
        
        return n *  printFact(n-1);


    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(printFact(5));

    }
}
