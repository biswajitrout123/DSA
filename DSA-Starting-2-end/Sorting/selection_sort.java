package Sorting;

/**
 * selection_sort
 */
public class selection_sort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 10, 2, 4, 8, 10, 28 };
        selectionSort(arr);
        System.out.println("Sorted Array");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}