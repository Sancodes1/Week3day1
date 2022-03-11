package Week3day2;

import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		
		text1=text1.toLowerCase();
		text2=text2.toLowerCase();
		
		if(text1.length()!=text2.length()) {
			System.out.println("The string is not anagram");
		}
		else {
		      char[] charArray = text1.toCharArray();
		      char[] charArray1 = text2.toCharArray();
		
		        Arrays.sort(charArray);
				Arrays.sort(charArray1);
				if(Arrays.equals(charArray,charArray1)==true) {
					System.out.println("String is anagram");
				}
					else {
						System.out.println("String is not anagram");
					}
				}

}
}
