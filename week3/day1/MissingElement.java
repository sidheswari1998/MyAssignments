package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// Declare an array {1, 2, 3, 4, 10, 6, 8}
		int[] a = {1, 2, 3, 4, 10, 6, 8};
		// - Do a comparison check if there is a gap in the sequence of numbers.
		// - Print the numbers that are missing
		Arrays.sort(a);
		int length = a.length;
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			if (a[i] != i+1) {
				array.add(a[i]-1);
			}
		}
		System.out.println("Missing Elements List : "+array);
	}

}
