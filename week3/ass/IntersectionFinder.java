package week3.ass;

import java.util.ArrayList;
import java.util.List;

public class IntersectionFinder {

	public static void main(String[] args) {
		int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

        List<Integer> list1 = new ArrayList<Integer>();
        for (int num : array1) {
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<Integer>();
        for (int num : array2) {
            list2.add(num);
        }

        
        System.out.print("Intersection of arrays: ");
        for (int num : list1) {
            if (list2.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }

	}

