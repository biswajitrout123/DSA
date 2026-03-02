package StriverSheetsPractice;
public class number_that_appears_once_other_numbers_twice {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        System.out.println(result);
    }
}



