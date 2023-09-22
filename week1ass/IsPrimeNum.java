package week1ass;

public class IsPrimeNum {

	public static void main(String[] args) {
		
		int number = 29;

        
        boolean isPrime =checkPrime(number);

       
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= (num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
		}

		
	}

  