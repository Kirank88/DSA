public class printExtreme {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,1};
        int n = arr.length;
        int start=0;
        int end = n-1;

        while (true) {   //while(start <= end)

            if(start==end) {
                System.out.println(arr[start]);
            }

            if(start < end) {
            
                System.out.println(arr[start]);
                System.out.println(arr[end]);
                
            }
            start++;
            end--;

           
        }
        
        
    }
}
