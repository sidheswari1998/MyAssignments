package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		
		// By String Literal
		String name1="TestLeaf";     //001
		
		String name3="TestLeaf";    //001
		
		//By instantiation
		String name2=new String("TestLeaf");  //002
		String name4=new String("TestLeaf");  //003
		
		//.equals method - compare the values of 2 Strings
		//== method - compares the reference address of 2 Strings
		
		//equals method
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name2));
		
		//== method
		System.out.println(name1==name3);
		System.out.println(name1==name2);
		System.out.println(name2==name4);
		
		System.out.println("----------------");
		
		String str="March2025";   //march2025
		
		//To get the length of String
		int lengthOfString = str.length();
		System.out.println("String length is "+lengthOfString);
		
		
		//contains partial value
		System.out.println(str.contains("march"));
		
		//equalsIgnorecase
		System.out.println(str.equalsIgnoreCase("march2025"));
		
		//toUppercase - March2025  - MARCH2025
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		
		//toLowercase March2025 - march2025
		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase);
		
		//toCharArray - Convert the String to Character Array
		char[] characters = str.toCharArray();
		//March2025   {'M','a','r','c','h','2','0,'2','5'}
		System.out.println(characters[0]);
		               
		System.out.println("------------------");
		
		String batchName="March25";
		
		//charAt       - Character at
		char charAt = batchName.charAt(1);
		System.out.println(charAt);
		
		//subString - crop a String to its lower format
		//input-1 String     output=1 String
		
		//Begin Index is inclusive
		String substring = batchName.substring(2);
		System.out.println(substring);
		
		String substring2 = batchName.substring(2, 4);
		System.out.println(substring2);
		
		//split - to convert 1 String to multiple Strings
		
          String batch="WeekdayMarch2025";
          String[] split = batch.split("a");
          System.out.println(split[2]);
          
          
          //parseInt
          String amount="1000";
          int rupee=100;
          //                 1000100
          System.out.println(amount+rupee);
		
		//parseInt - Convert String into int -Integer
		int parseInt = Integer.parseInt(amount);
		System.out.println(parseInt+rupee);
		
		String dollar="10000Rupees";
				
		
		   //replaceAll
		String replaceAll = dollar.replaceAll(amount, dollar);
		System.out.println(replaceAll);
	}

}