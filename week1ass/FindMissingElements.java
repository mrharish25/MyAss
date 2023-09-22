package week1ass;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		  int[] arr = {1, 4, 3, 2, 8, 6, 7};
	        
	        Arrays.sort(arr);
	        
	        int missing = 0;
	        
	        
	        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
	            
	            if (Arrays.binarySearch(arr, i) < 0) {
	                missing = i;
	                break; 
	            }
	        }
	        System.out.println("Missing Element: " + missing);
	}

}
