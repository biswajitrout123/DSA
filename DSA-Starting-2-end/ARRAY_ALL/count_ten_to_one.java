public class count_ten_to_one {
    public static void count(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        count(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        count(10);

    }
}
