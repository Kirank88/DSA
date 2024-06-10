/**
 * ExponentialSearch
 */
/* 
public class ExponentialSearch {

    public static int bs (int arr[], int start, int end, int x) {
            while (start <= end) {
                int mid = (start + end)/ 2;
                if (arr[mid] == x) {
                    return mid;
                }
                else if (arr[mid] > x) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return -1;
     }
    public static int expSearch (int arr[], int n, int x) {
        if (arr[0]==x) {
            return 0;
        }int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }
        return bs(arr, i/2, Math.min(i, n-1), x);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int x = 11 ;
        int ans = expSearch(arr, n, x);
        System.out.println("ans is:" + ans);


    }    
}
*/



//Exponential Unbounded Search / Doubling Search / Galloping Search / Startic Search
//includes binary + exponrntial search
public class ExponentialSearch {

    public static int bs(int arr[], int start, int end, int x) {
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            else if(arr[mid] > x) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int expUnboundedSearch (int arr[], int n, int x) {

        
        int i = 0;
        int j = i + 1;
        while (arr[j] < x) {
            i = j;
            j = j * 2;
        }
        return bs(arr, i, j, x);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int x = 10;
        int n = arr.length;
        int ans = expUnboundedSearch(arr, n, x);
        System.out.println("ans is:" + ans);


    }
}