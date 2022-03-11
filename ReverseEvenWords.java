package Week3day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] wordArray = test.split(" ");
		
		for(int i=0;i<=wordArray.length;i++) {
			
			if(i%2!=0)	{
				char[] name2 = wordArray[i].toCharArray();		
				for(int j=name2.length-1;j>=0;j--) {
					System.out.print(name2[j]);
				}
				}
				else
			{
				System.out.print(" "+wordArray[i]+" "); //0
			}
			}

		}
	}
			
