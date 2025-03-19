package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a = {3,2,11,4,6,7};
		
		int[] b = {1,2,8,4,9,7};
		
		int lengthOfa = a.length;
		
		int lengthOfb = b.length;
		
		System.out.println("---------------------" + "\n" + "Matching Numbers : " + "\n" + "---------------------");
		
		for (int i = 0; i < lengthOfa; i++) {
			
			for (int j = 0; j < lengthOfb; j++) {
				
				if (a[i] == b[j]) {
					
					System.out.println(a[i]);
					
				} 
				
			}
			
		}
		
	}

}
