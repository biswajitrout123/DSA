import java.util.ArrayList;
import java.util.Scanner;

public class library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of chairs:");
        int chair = sc.nextInt();

        System.out.println("Enter number of students present:");
        int student = sc.nextInt();

        System.out.println("Enter roll number of student who has a laptop:");
        int target = sc.nextInt();

        System.out.println("Enter students roll numbers:");

        int[] arr = new int[student];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            System.out.println("No student has a laptop.");
        } else {
            System.out.println("Student who has a laptop: " + list);
        }

        sc.close();
    }
}