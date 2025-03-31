package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// Declare an array for {3, 2, 11, 4, 6, 7}
		int[] a = {3, 2, 11, 4, 6, 7};
		// Declare another array for {1, 2, 8, 4, 9, 7}
		int[] b = {1, 2, 8, 4, 9, 7};
		//  Compare both the arrays
		//- Print the values if they are equal
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					array.add(a[i]);
				}
			}
		}
		System.out.println("The Common numbers : "+array);
	}

}
