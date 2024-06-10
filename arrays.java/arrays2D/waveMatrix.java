public class waveMatrix {
    public static void wavePrint(int arr[][]) {
        
        int row = arr.length;
        int col = arr[0].length;

        for(int startCol=0; startCol<col; startCol++) {
           //even number of colm - Top to bottom
            if((startCol % 2) == 0) {
                for (int i = 0; i<row; i++) {
                     System.out.print(arr[i][startCol] + " ");
                }
            }
            else {
                //odd number of Colm - Bpttom to Top
                for(int i = row-1; i>=0; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
              }
              System.out.println();
        }
        
    }

    
        public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        {17,18,19,20}};
        wavePrint(arr);
    }
    
}
