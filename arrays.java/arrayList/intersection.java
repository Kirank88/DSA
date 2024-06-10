package arrayList;

import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        arr2.add(1);
        arr2.add(2);
        arr2.add(4);
        arr2.add(5);

        for (int i =0; i<arr1.size(); i++) {
            int element = arr1.get(i);
            for (int j=0; j<arr2.size(); j++) {
                if (element == arr2.get(j)) {
                    ans.add(element);

                }
            }
        }
        System.out.println(ans);

    }
}
