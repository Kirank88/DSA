package arrayList;
import java.util.*;

public class maxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int max = Integer.MIN_VALUE;

    //    for (int i = list.size()-1; i>=0 ; i--) {
    //         System.out.print(list.get(i) + " ");
    //     }
    
    for (int i = 0; i<list.size() ; i++) {
                // if (max < list.get(i)) {
                //     max = list.get(i);
                // }
                max = Math.max(max, list.get(i));
             }      
    System.out.println("Max elemet :" + max);
        
        

        
    }
    
}
