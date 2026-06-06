package StriverSheetsPractice.Bnary_Search.Bnary_Search_Answers;

public class Find_square_root_of_a_number {
    public static void main(String[] args) {
        int n = 36;
        int ans = 0;
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if((long) mid * mid <= n) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }   
        }
        System.out.print(ans);
        
        
    }
}
