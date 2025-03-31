package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatesFromString {

	public static void main(String[] args) {
		String str = "google";
		char[] charArray = str.toCharArray();
		System.out.println("Before duplicates : ");
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		Set<Character> output = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			output.add(charArray[i]);
		}
		System.out.println("After duplicates : "+output);

	}

}
