package Week3day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;

                char[] test1=  test.toCharArray();
                
                for (int i = 0; i < test1.length; i++) {          //char_array - .length  //string - .length()
        	    	
        	    	char ch = test1[i];
        	    	
        	    	if (Character.isLetter(ch)) {
        	    		
        	    	letter += 1;	
        	    	}
        	    	
        	    	else if (Character.isDigit(ch)) {
        	    		
        	    		num += 1;
        	    	}
        	    	
        	    	else if (Character.isSpaceChar(ch)) {
        	    		
        	    		space += 1;
        	    	}
        	    	else {
        	    		specialChar++;
        	    	}
        	    	
        		
        		}
        		
        	    System.out.println("no. of letter: " + letter);
        		System.out.println("no. of space: " + space);
        		System.out.println("no. of number: " + num);
        		System.out.println("no. of specialCharcter: " + specialChar);
            	

        	}

        }
	
