package Day_6;

public class Q_2 {
    public static void main(String[] args) {
        // Check if array is palindrome
        int[] arr = {8,9,8};
        int start = 0;
        int end = arr.length-1;
        boolean isPalindrome = true;
        while (start < end) {
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not a Palindrome Array");
        }
    }
}
