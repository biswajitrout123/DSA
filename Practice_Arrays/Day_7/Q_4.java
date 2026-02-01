package Day_7;

public class Q_4 {
    public static void main(String[] args) {
        // Q-4 Check if any subarray has sum equal to given value
        // int[] arr = { 2, 1, 5, 1, 3, 2 };
        // int target = 8;
        // int sum = 0;
        // int left = 0;

        // for (int right = 0; right < arr.length; right++) {
        //     sum += arr[right];

        //     while (sum > target) {
        //         sum -= arr[left];
        //         left++;

        //     }
        //     if (sum == target) {
        //         System.out.println("YES");
        //         return;

        //     }
        // }
        // System.out.println("NO");


        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int sum = 0;
        int target = 8;
        int left = 0;
        for(int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];
            System.out.println(sum);

            while(sum > target) {
                sum = sum - arr[left];
                left++;
            }

            if(sum == target) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");


    


    }

}





