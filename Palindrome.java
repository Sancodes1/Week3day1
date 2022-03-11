package Week3day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Madam";
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			reverse = reverse+str.charAt(i);
			}
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("The string is palindrome");
		}
			else
			{
				System.out.println("The String is not Palindrome");
		}
	}

}
