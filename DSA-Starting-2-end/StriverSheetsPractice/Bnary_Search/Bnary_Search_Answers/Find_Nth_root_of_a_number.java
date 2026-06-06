package StriverSheetsPractice.Bnary_Search.Bnary_Search_Answers;

public class Find_Nth_root_of_a_number {

    public static void main(String[] args) {
        int N = 3;
        int M = 27;

        int low = 1;
        int high = M;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long value = 1;

            for(int i = 0; i < N; i++){
                value = value * mid;    
                
                
                
            }

            if(value == M) {
                System.out.print(mid);
                return;
            }

            else if(value < M) {
                low = mid + 1;                
            }

            else {
                high = mid - 1;
            }          
        }
        System.out.print("-1");
    }
}