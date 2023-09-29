package week3.ass;

import java.util.Arrays;

public class MissingNumberFinder {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 10, 6, 8};
     
	        Arrays.sort(array); 
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] + 1 != array[i + 1]) {
	                int missingNumber = array[i] + 1;
	                System.out.println("Missing number: " + missingNumber);
	            }
	        }

	}

}
