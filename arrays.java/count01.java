public class count01 {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,0,1,0,1,1};
        int numZero = 0, numOne=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                numZero++;
            } 
            else{
                numOne++;
            }
    }
    System.out.println("Number of zeroe's:" + numZero);
    System.out.println("Number of one's:" + numOne);
}
    
}
