

public class passByValue {
    
    public static void print(int arr[], int size) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void inc(int arr[], int size) {
        arr[0] += 10;
        print(arr, size);
    }
    public static void main(String[] args) {
        
        int arr[] = {5,6};
        int size = 2;
        inc(arr,size);

        print(arr,size);

    }


}
