package week3.ass;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
        String text2 = "potss";
        
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch");
        }

        char[] Array1 = text1.toCharArray();
        char[] Array2 = text2.toCharArray();
   
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        if (Arrays.equals(Array1, Array2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
	}
