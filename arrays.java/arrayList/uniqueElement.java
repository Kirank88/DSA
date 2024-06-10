package arrayList;
import java.util.*;

public class uniqueElement {

    public static  int unique(ArrayList<Integer> numbers) {
        int ans = 0;
        for (int i=0; i<numbers.size(); i++) {
            ans = ans ^ numbers.get(i);
        }
        return ans;
    }  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the size");
        int n =sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        System.out.println(numbers);
       System.out.println( unique(numbers));
     }
}
