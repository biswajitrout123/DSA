package Placements.Array_All;

public class FirstLast_Position_Of_Element_In_Sorted_Array {
    public static void main(String[] args) {
        // First_And_Last_Position_Of_Element_In_Sorted_Array.java
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(i);
                System.out.println(i+1);
                break;
            }
        }
        System.out.println();
    }
}