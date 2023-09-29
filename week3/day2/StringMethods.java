package week3.day2;

public class StringMethods {
	
	   public static void main(String[] args) {
		
	        int count = 0;
	      
	        String input = "TestLeaf";
	    
	        char[] charArray = input.toCharArray();
	      
	        for (char c : charArray) {
	     
	            if (c == 'e') {
	                
	                count++;
	            }
	        }
	        
	        System.out.println("'e'"+ count);
	    }
	}


