package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int fibRange = 8 , num1 = 0, num2 =1;
		
		System.out.println("---------------------" + "\n" + "Fibonacci Series:" + "\n" + "---------------------");
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 2; i < fibRange; i++) 
		{
			int num3 = num1 + num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}

	}

}
