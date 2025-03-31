package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		String[] str = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		Arrays.sort(str);
		int length = str.length;
		List<String> string = new ArrayList<String>();
		for (int i = length-1; i >= 0; i--) {
			string.add(str[i]);
		}
		System.out.println("Output of Revesre Sorting of Strings : "+string);
	}

}
