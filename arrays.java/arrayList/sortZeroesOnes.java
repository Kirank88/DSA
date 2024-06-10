package arrayList;
import java.util.*;
public class sortZeroesOnes {

    public static void counts(ArrayList<Integer>numbers) {
        int start = 0;
        int end = numbers.size() - 1;
        int i = 0;

       while (i != end) {
            if (numbers.get(i)==0) {
                Collections.swap(numbers, i, start);
                start++;
                i++;

            }
             
             else {
                Collections.swap(numbers, end, i);
                end--;
                i++;
                }
        }
        System.out.println(numbers);
//==========================================================================
//Method -2 : Counter Approach

            // int count = 0;
            // for (int i =0; i<numbers.size(); i++) {
            //     if(numbers.get(i)==0) {
            //         count++;
            //     }
            // }

            // for (int i =0; i<count;i++) {
            //     numbers.set(i, 0);
            // }

            // for (int i =count; i<numbers.size();i++) {
            //     numbers.set(i, 1);
            // }

            // System.out.println(numbers);
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
        counts(numbers);

    }
}
