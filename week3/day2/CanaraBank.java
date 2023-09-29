package week3.day2;

public abstract class CanaraBank implements Payment {
	
	public void cashOnDelivery() {
	
		System.out.println("cashOnDelivery-Rs 500");
	}
	public void upiPayments() {
		System.out.println("upiPayments-Gpay");
	}
	
	public void cardPayments() {
		System.out.println("cardPayments-Deb or Crd");
	}
	public void internetBanking() {
		System.out.println("internetBanking-Canara");
	}
	public static void main(String[] args) {
		System.out.println("payments");
	}

}
