public class searchingIn2D {

    public static boolean searchTarget (int arr [][], int rows, int colms, int target) {

        int start = 0;
        int end = rows * colms - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {
            int rowIndex = mid / colms;
            int colmIndex = mid % colms;
            

            if (arr[rowIndex][colmIndex] == target) {
                System.out.println("Found at  " +rowIndex + " " + colmIndex);
                return true;
            }

            else if (arr[rowIndex][colmIndex] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
            mid = start + (end - start)  / 2;

        }
        return false; 
    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3,4,}, 
                        {5,6,7,8,},
                        {9,10,11,12,}, 
                        {13,14,15,16,},
                        {17,18,19,20}};

        int rows = 5;
        int colms = 4;
        int target = 19;

        boolean ans = searchTarget(arr, rows, colms, target);

        if(ans) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
