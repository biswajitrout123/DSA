package Day_4;

public class day4 {
    public static void main(String[] args) {
        // Q-1 Insert an element at the end
        int capacity = 10;
        int[] arr = new int[capacity];

        int n = 7;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;

        int newOne = 100;

        if (n < capacity) {
            arr[n] = newOne;
            n++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// DAY 4 – Insertion & Deletion

// 🎯 Goal: Master shifting logic

// Q-1 Insert an element at the end

// Q-2 Insert an element at the beginning

// Q-3 Insert an element at a given index

// Q-4 Delete an element from a given index

// Q-5 Delete first occurrence of a value

// Q-6 Remove all occurrences of a given value

// ✅ You should clearly understand shift left / shift right