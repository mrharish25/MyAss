package week1ass;

public class Pallindrome {

	public static void main(String[] args) {
int input = 121;
        
        int originalInput = input;
        int reversed = 0; 
       
        while (input > 0) {
            int rem = input % 10; 
            reversed = reversed * 10 + rem; 
            input = input / 10; 
        }
        
        
        if (reversed == originalInput) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

	}

}
