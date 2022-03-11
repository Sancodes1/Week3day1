package Week3day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char c ='e';
		char[] charArray = str.toCharArray();
		int size=charArray.length;
		
		for(int i=0;i<size;i++)
		{	
			if(str.charAt(i) == c)
				count++;
		}
		
		System.out.println( c +" occurs " + count + " times in " + "'"+str+"'");
	}
		
		}


