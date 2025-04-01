package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Declare a Set
		//HashSet
		//Set<String> mentors=new HashSet<String>();
		
		//TreeSet
		//Set<String> mentors=new TreeSet<String>();
		
		//LinkedHashSet
		Set<String> mentors=new LinkedHashSet<String>();
		
		System.out.println("The set is: "+mentors);
		mentors.add("Harrish");
		mentors.add("Udhay");
		mentors.add("Vinoth");
		mentors.add("Muthu");
		System.out.println("The current set is: "+mentors);
		//   0        1       2      3
		//[Vinoth, Harrish, Udhay, Muthu]    - HashSet
		//   0         1     2       3
		//[Harrish, Muthu, Udhay, Vinoth]    - TreeSet
		//   0         1      2      3
        //[Harrish, Udhay, Vinoth, Muthu]    - LinkedHashSet
		
		//Adding duplicate
		mentors.add("udhay");
		System.out.println("Set after adding duplicate: "+mentors);
		
		//Removing an element
		mentors.remove("Udhay");
		System.out.println("Set after removing Udhay: "+mentors);
		
		//To count the number of element
		int sizeOfSet = mentors.size();
		System.out.println("Set size is: "+sizeOfSet);
		
		//addAll
		Set<String> trainers=new TreeSet<String>();
		trainers.addAll(mentors);
		System.out.println("The current trainers set is: "+trainers);
		
		//To retrieve an element
		//Step1: Convert the Set into List
		//Step2: use the Get method in the List
		List<String> allTrainers=new ArrayList<String>(trainers);
		System.out.println("The List is: "+allTrainers);
		//    0        1      2        3
		// [Harrish, Muthu, Vinoth, udhay]
		String dataAtIndex2 = allTrainers.get(2);
		System.out.println(dataAtIndex2);
		
	}

}