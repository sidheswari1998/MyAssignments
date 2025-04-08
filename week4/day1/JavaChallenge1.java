package week4.day1;

public class JavaChallenge1 {

	public static void main(String[] args) {
		/*Given a string s consisting of words and spaces, return the length of the last word in the string.
		A word is a maximal substring consisting of non-space characters only.*/
		String s = "fly me   to   the moon";
		//String[] split = s.split(" ");
		//System.out.println(split[1]);
		int length=0;
		for (int i = s.length()-1; i > 0; i--) {
			char ch = s.charAt(i);
			if (ch==' ') {
				break;
			}
			else {
				length++;
			}
		}
		System.out.println("Length of Last Word : "+length);
	}

}
