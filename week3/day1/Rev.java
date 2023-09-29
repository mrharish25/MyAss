package week3.day1;

public class Rev {
public static void main(String[] args) {
	String companyName="Test Leaf";
	char[] charArray = companyName.toCharArray();
	for (int i  = charArray.length - 1; i >= 0; i--) {
		System.out.print(charArray[i]);
		
	}
}
}
