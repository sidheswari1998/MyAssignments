package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int num = 7;
		
		int count = 0;
		
		if (num<2) 
		{
			System.out.println(num  + " is NOT a Prime Number!");
			
		}
		
		for (int i = 1; i <=num; i++) 
		{
			if (num%i == 0) 
			{
				count += 1;
				
			}
			
		}

		if (count>2) 
		{
			System.out.println(num + " is NOT a Prime Number!");
			
		}
		else
		{
			System.out.println(num + "is Prime Number!");
		}
	}

}
