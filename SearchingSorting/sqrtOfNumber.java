import java.util.Scanner;

class sqrtOfNumber {

    public static int sqrt (int n) {
        int start = 0;
        int end = n;
        int ans = -1; 
        int mid = start + (end - start)/2;

        while (start <= end) {
            
            if (mid * mid == n) {
                return mid;
            } 
            
            else if (mid * mid > n) {
                end = mid - 1;
            }
            else {
                ans = mid;
                start = mid + 1; 
            }
            mid = start + (end - start)/2;
        }
        return ans;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int ans = sqrt(n);
        System.out.println(ans );
       
        System.out.println("Enter the precision");
        int precision = sc.nextInt();
        double finalAns = ans;
        double step = 0.1;
          
        for (int i = 0; i < precision; i++) {

            for (double j = finalAns; j * j <= n; j = j + step) {
                finalAns = j;
            }
            step /= 10;
        }

        System.out.println(finalAns);


    }
}
