package Day_2;

public class day2 {
    public static void main(String[] args) {
        // Check if an element exists in an array
        int[] arr = {4,6,8,7,10};
        int finEle = 89;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == finEle){
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }
    }
}












// DAY 2 – Searching (Linear Search)

// 🎯 Goal: Learn how to find things

// Q-1 Check if an element exists in an array

// Q-2 Find index of a given element

// Find first occurrence of an element

// Find last occurrence of an element

// Count frequency of a given element

// Search an element and print “Found” or “Not Found”

// ✅ You should know when search stops early