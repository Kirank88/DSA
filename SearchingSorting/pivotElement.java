//You are given a sorted and rotated array find larget pivot element

class pivotElement {
    public static int findPivot(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s)/2;

        while (s <= e) {
            if (s == e) {
                return s;
            }
            if (mid <= e && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid-1 >= s && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[s] > arr[mid]) {
                e = mid - 1;
            }
            else
            s = mid + 1;
        mid = s + (e - s)/2;

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,10};

        int ans = findPivot(arr);
        System.out.println(ans);
    }
}