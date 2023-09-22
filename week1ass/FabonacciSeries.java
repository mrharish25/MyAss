package week1ass;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the range for the Fibonacci series: ");
        int range = scanner.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.print("Fibonacci Series: " + first + ", " + second);
        
        int next;
        
        while ((next = first + second) <= range) {
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        
        System.out.println();
        
        scanner.close();

    }
	}


