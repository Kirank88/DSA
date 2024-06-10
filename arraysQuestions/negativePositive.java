
//Dutch National Flag Algorithm
//Time Complexity:  o(n);
//Space Complexity: o(1);
public class negativePositive {
    public static void num(int arr[], int n) {
        int low = 0;
        int high = n-1;

        while (low < high) {
            if (arr[low] < 0 ) {
                low++;

            }
            else if (arr[high] > 0) {
                high--;
            } 
            else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                
            }
        }
        for (int i =0; i<n; i++) {
            System.out.println(arr[i]);

        }
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-2,-1};
        int n = arr.length;
        num(arr, n);
    }
}
