package week1.day2;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		
		int num1 = 121;
		
		int num2 = num1;
		
		int rem = 0;
		
		//while (num1 > 0) 
		//{
			
			//rem = (rem*10) + num1%10;
			//num1 /= 10;
			
		//}
		
		for (int i = num1; i > 0; i/=10) 
		{
			rem = (rem*10) + i%10;
			
		}
		
		if (num2 == rem) 
		{
			System.out.println(num2 + " is Palindrome!");
			
		}
		else
		{
			System.out.println(num2 + " is not a Palindrome");
		}

	}

}
