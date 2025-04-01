
package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declare a List
		List<String> learners=new ArrayList<String>();
		System.out.println(learners);
		
		//Add- To add an element in a List
		learners.add("Venkatesh");
		System.out.println("The current list is: "+learners);
		
		//Add multiple data
		learners.add("Rajesh");
		learners.add("Selvi");
		learners.add("Bharath");
		System.out.println("The list after adding multiple data: "+learners);
		//     0         1         2      3       4       5
		//[Venkatesh,  prasana, Rajesh, Selvi, Bharath, Rajesh]
		
		//Add the element by index
		learners.add(1, "Prasana");
		System.out.println("The List adding after element using index: "+learners);
		
		//Add a duplicate data
		learners.add("Rajesh");
		System.out.println("List after adding duplicates: "+learners);
		//     0        1         2      3       4       5
		//[Venkatesh, Prasana, Rajesh, Selvi, Bharath, Rajesh]
		
		
		//remove - remove an element from the list
		learners.remove(2);
		System.out.println("List after remove element at index 2 is :"+learners);
		
		//    0          1         2      3       4
		//[Venkatesh, Prasana, Selvi, Bharath, Rajesh]
		
		//Retrive an element (get)
		String elementAtIndex1 = learners.get(1);
		System.out.println(elementAtIndex1);
		
		//size method
		int sizeOfList = learners.size();
		System.out.println("List size is : "+sizeOfList);
		
		//Sort method   - ASCII - Alphabetical order
		Collections.sort(learners);
		System.out.println("List after sorting :"+learners);
		
		//addAll - It will add the all the elements from 1 List to Another List
		
		// learners -> Another List
		//Declare an empty List
		List<String> employees=new ArrayList<String>();
		System.out.println("Employees list is :"+employees);
		employees.addAll(learners);
		System.out.println("The current employees list is: "+employees);
		

		//Clear all the elements
		learners.clear();
		System.out.println("Learners list after clearing: "+learners);
		
		
	}

}
