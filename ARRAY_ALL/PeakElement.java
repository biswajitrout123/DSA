public class PeakElement {

    public static int findpeak(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while (low < high) {
            int mid = (low + high) / 2;

            if(arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        // FIND PEAK ELEMENT
        int[] arr = {1, 2, 3, 1};
        int peakIndex = findpeak(arr);
        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak value: " + arr[peakIndex]);


    }
}
