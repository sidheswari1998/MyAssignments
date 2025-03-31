package week3.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		// Declare an array {3, 2, 11, 4, 6, 7}
		// {2,3,4,6,7,11}
		int[] a = {3, 2, 11, 4, 6, 7};
		// - Pick the 2nd element from the last and print it
		Arrays.sort(a);
		int length = a.length;
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			array.add(a[i]);
		}
		System.out.println("The Second Largest Number in given array : " + array.get(length-2));
	}

}
