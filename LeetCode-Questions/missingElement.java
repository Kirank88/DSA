
//Missing Element With Duplicates
public class missingElement {
    public static void missing(int a[], int n) {
        
        //Marking index as visited
        for(int i = 0; i< n ; i++ ) {
            int index = Math.abs(a[i]);

            if(a[index-1] > 0) {
               a[index-1] *= -1;
               
            }
        }  
        
        for(int i = 0; i < n; i++) {
            if(a[i] > 0) {
                int ans = i + 1;
                System.out.println("Missing element is:" + ans);
            }
        }     
    } 

    public static void missing2(int a[], int n) {
            int i = 0;
        while (i < n) {
            int index = a[i] - 1;

            if (a[i] != a[index] ) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            } 
            else {
                ++i;
           }
        }
        for ( i=0; i< n; i++) {
            System.out.println(a[i]);
        }

        for ( i =0 ; i<n; i++) {
        if (a[i]!= i+1) {
            int ans = i+ 1;
            System.out.println("Missing number:" + ans);
        }
    }
        
    }
    public static void main(String[] args) {
       
        int a[] = {1,1,1,1,1};
        int n = a.length;
        missing2 (a, n);
        

      
    }
    
}



