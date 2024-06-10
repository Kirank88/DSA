import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr [] = {3,4,5,6,7,8};
        int n = arr.length;
        //int arr1[]= new int[n];
        int start = arr[0];
        int end = arr[n-1];


        //first approach
        // for(int i=n-1; i>=0; i--) {
        //    System.out.println(arr[i]);
        // }

        //using swapping last and first each time

        // ,..

             int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));

        // In-place reversal of array
        for(int i = 0; i < array.length / 2; i++) {
            // Swapping the elements
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(array));

         
    }
}
