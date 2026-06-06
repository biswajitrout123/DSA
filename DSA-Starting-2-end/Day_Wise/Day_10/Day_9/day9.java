package Day_9;

public class day9 {
    public static void main(String[] args) {
        // Find duplicate elements
        int[] arr = { 4, 5, 5, 6, 7, 8, 8};
        boolean duplicate = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    System.out.println("Duplicate element = " + arr[i]);
                    break;
                }
            }
        }
        if (!duplicate) {
            System.out.println("No Duplicates");
        }
    }
}

// 📅 DAY 9 – Duplicates & Frequency

// 🎯 Goal: Handle repeated data

// 1. Find duplicate elements

// 2. Remove duplicates from sorted array


// 3. Count frequency of each element

// 4. Find element with highest frequency

// 5. Find unique element

// ✅ You should think: counting / tracking
