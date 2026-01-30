package Day_7;

public class Q_4 {
    public static void main(String[] args) {
        // Q-4 Check if any subarray has sum equal to given value
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int target = 8;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;

            }
            if (sum == target) {
                System.out.println("YES");
                return;

            }
        }
        System.out.println("NO");
    }

}

// import java.util.HashSet;

// public class Q_4 {
// public static void main(String[] args) {

// int[] arr = {10, -5, 2, -3, 7};
// int S = 4;

// HashSet<Integer> set = new HashSet<>();
// int sum = 0;

// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];

// if (sum == S || set.contains(sum - S)) {
// System.out.println("YES");
// return;
// }

// set.add(sum);
// }

// System.out.println("NO");
// }
// }
