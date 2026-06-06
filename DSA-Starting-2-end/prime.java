import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num!");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

