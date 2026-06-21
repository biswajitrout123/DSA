package Recursion_DSA;

public class print_My_Name_Ten_Times {
    public static void printMyName(int n){
        if(n == 0){
            return;
        }
        System.out.println("Biswajit Rout");
        printMyName(n - 1);

        
    }
    public static void main(String[] args) {
        int n = 10;
        printMyName(n);

        
    }
    
}
