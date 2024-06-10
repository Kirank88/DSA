public class divisionDividend {

    public static int solve(int dividend, int divisor) {

        int start = 0;
        int end = Math.abs(dividend);
        int mid = start + (end - start) / 2;
        int ans = 1;
        while (start <= end) {
            if (Math.abs(mid * divisor) == Math.abs(dividend)) {
                ans = mid;
                break;
            }
            
            if (Math.abs(mid * divisor) > Math.abs(dividend)) {
                end = mid - 1;
            }
            
            if (Math.abs(mid * divisor) < Math.abs(dividend)) {
                ans = mid;
                start = mid + 1;
            }

            mid = start + (end - start) / 2;
        }
        if (dividend>0 && divisor>0 || dividend<0 && divisor<0)
        return ans;
    return -ans;
    }
    public static void main(String[] args) {
        int dividend = -22;
        int divisor = 7;

        int ans= solve(dividend, divisor);
        System.out.println(ans);

    }
    
}
