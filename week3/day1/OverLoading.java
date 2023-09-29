package week3.day1;

public class OverLoading {
	public void gmail() {
		System.out.println("Sign in");
	}
public void gmail(int msg) {
	System.out.println(msg);
}
public void gmail(int msg,String status) {
	System.out.println("gmail:"+msg+" "+"My status:"+status);

}
public void gmail(int status,String msg,Boolean snap) {
	System.out.println("gmail:"+status+""+" "+"My:"+msg+" "+"Scereen:"+snap);
}
public static void main(String[] args) {
	OverLoading ov=new OverLoading();
	ov.gmail();
	ov.gmail(25);
	ov.gmail(12, "Hi");
	ov.gmail(100, "Hello", false);
}
}
