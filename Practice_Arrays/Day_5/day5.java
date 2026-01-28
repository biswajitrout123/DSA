package Day_5;

public class day5 {
    public static void main(String[] args) {
        // Reverse an array
        int[] arr = {8,9,0,10};
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}












// DAY 5 – Array Modification

// 🎯 Goal: Manipulate arrays confidently

// Q-1 Reverse an array

// Q-2 Copy one array into another

// Q-3 Replace all negative numbers with zero

// Q- 4 Move all zeros to the end

// Q-5 Separate even and odd numbers

// Q-6 Rotate array left by 1

// ✅ You should start seeing patterns