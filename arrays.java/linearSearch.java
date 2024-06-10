import java.util.*;
public class linearSearch {

    public static void linear(int arr[], int key, int n) {
        int flag = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == key) {
                flag=1;
                System.out.println("Found at index:" + i);
            }
         }
            if(flag==0) {
            System.out.println("Not found");
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:  ");
    int n = sc.nextInt();
    System.out.println("Enter the key element: ");
    int key = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the  elements: ");
     for(int i = 0; i<arr.length; i++) {
        arr[i] =sc.nextInt();
     }
     
     linear(arr, key, n);

    // for(int i = 0; i<arr.length; i++) {
    //     if(arr[i] == key) {
    //         System.out.println("Found at index:" + i);
    //     }
        
    //  }
    
    //     System.out.println("Not found");
    

     
     
  
    }
    
}
