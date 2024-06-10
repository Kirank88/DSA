public class nearlySortedArray {

    public static int binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid - 1] == target) {
                return mid - 1;
            }

            if (arr[mid + 1] == target) {
                return mid +  1;
            }

            if(target > arr[mid]) {
                start = mid + 2;
            }

            else if (target < arr[mid]) {
                end = mid - 2;
            }

            else {
                end = mid - 2;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,3,40,20,50,80,70};
        int target = 40;

        int ans = binarySearch(arr, target);
        System.out.println("Index of " + 40 + " is " + ans);

        

    }
}
