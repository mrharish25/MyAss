package week3.day1;

public class OverLoading3 extends OverLoading2 {
	public void gmail(String Status) {
		System.out.println("Normal to High");
		
	}
public static void main(String[] args) {
	OverLoading3 g=new OverLoading3();
	g.gmail("HI");
}
}
