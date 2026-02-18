// 📅 DAY 8 – Sorting Basics

// 🎯 Goal: Sorting logic (not speed)

// Q-1 Sort an array (any method)

// Q-2 Check if array is already sorted

// Q-3 Sort array in descending order

// Q-4 Find k-th largest element

// A-5 Sort only even numbers in array

// ✅ You should know why sorting helps



package Day_8;

public class day8 {

    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4};
        int size = nums.length;

        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            } 

        }
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
