// import java.util.*;
// class firstOccrence {

//     public static void occurence (ArrayList<Integer>numbers, int key) {
        
//         int start = 0;
//         int end = numbers.size() - 1;

//         int mid = (start + end) / 2;
//         int ans = -1;
//         while (start <= end ) {
//             if(key == numbers.get(mid)) {
//                 end = mid-1;
//                 ans = mid;
//             }

//             else if(key < numbers.get(mid) ) {
//                 end = mid-1;
//             }

//             else  {
//                 start = mid + 1;
//             }

//             mid = (start + end) / 2;
//         }
//         System.out.println("First occurence is:" + (ans + 1));

//     }

//     public static void lastOccurence (ArrayList<Integer>numbers, int key) {
//         int start = 0;
//         int end = numbers.size() - 1;
        
//         int mid = (start + end) / 2;
//         int ans = -1;
//         while (start <= end) {
//             if(key == numbers.get(mid)) {
//                 ans = mid;
//                 start = mid + 1;
//             }

//             else if (key < numbers.get(mid)) {
//                 end = mid - 1;
//             }

//             else {
//                 start = mid + 1;
//             }
//         mid = (start + end) / 2;
//         }
//         System.out.println("Last occurence of the number is:" + (ans + 1));
//     }

//     public static void main(String[] args) {
        
//         ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,7,7,8));
//         int key = 7;

//         occurence(numbers, key);
//         lastOccurence(numbers, 7);
 
//     }
// }


//////////===========================SECOND APPROACH==============///////////////////

// Java program to find first and last occurrence of
// an elements in given sorted array
import java.io.*;

class firstOccurence {
	// Function for finding first and last occurrence
	// of an elements
	public static void findFirstAndLast(int arr[], int x)
	{
		int n = arr.length;
		int first = -1, last = -1;
		for (int i = 0; i < n; i++) {
			if (x != arr[i])
				continue;
			if (first == -1)
				first = i;
            System.out.println("after first:" + i);
			last = i;
            System.out.println("after last:" + i);
		}
		if (first != -1) {
			System.out.println("First Occurrence = "
							+ first);
			System.out.println("Last Occurrence = " + last);
		}
		else
			System.out.println("Not Found");
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int x = 8;
		findFirstAndLast(arr, x);
	}
}

///////////======================THIRD METHOD: USING BUILT-IN===========================/////////

// Java program for the above approach
import java.util.ArrayList;
public class firstOccrence {
	public static int first(ArrayList list, int x)
	{
		// return first occurrence index
		// of element x in ArrayList
		// using method indexOf()
		return list.indexOf(x);
	}
	public static int last(ArrayList list, int x)
	{
		// return last occurrence index
		// of element x in ArrayList
		// using method lastIndexOf()
		return list.lastIndexOf(x);
	}
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		ArrayList<Integer> clist = new ArrayList<>();

		// adding elements of array to ArrayList
		for (int i : arr)
			clist.add(i);
		int x = 8;

		// displaying the first occurrence
		System.out.println("First Occurrence = "
						+ first(clist, x));

		// displaying the last occurrence
		System.out.println("Last Occurrence = "
						+ last(clist, x));
	}
}

