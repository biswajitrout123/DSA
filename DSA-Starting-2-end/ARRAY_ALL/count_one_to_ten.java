public class count_one_to_ten {
    public static void printOneToTen(int n) {
        if(n > 10) {
            return;
        }
        System.out.print(n + " ");
        printOneToTen(n + 1);
    }
    public static void main(String[] args) {
        int n = 10;
        printOneToTen(1);
        
    }
}
