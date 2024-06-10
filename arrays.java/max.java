public class max {
    public static void main(String[] args) {
    int maxElem = Integer.MIN_VALUE;
    
    int arr[] = {8,6,9,2,5,7,88};

    for(int i = 0; i< arr.length; i++ ) {
        if(arr[i] > maxElem) {
            maxElem = arr[i];
        }   
      }
      System.out.println(maxElem);
    }
   
    

}
