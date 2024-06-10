package arrayList;
import java.util.*;
import java.util.ArrayList;
public class creation {
    public static void main(String[] args) {
        //Boolean|String|Float
        ArrayList<Integer>list = new ArrayList<>();

        //Operations

        list.add(1); //o(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9); //o(n)

        System.out.println(list);

        //get opeartion //o(1)
        int element = list.get(2);
        System.out.println(element);

        //set operation
        list.set(2, 8);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println("Size of the list is:" + list.size());
        
    }
    
}
