package week3.ass;

public class TextField extends WebElement {
	public void getText() {

		System.out.println("Hello World");

	}
public static void main(String[] args) {
	TextField dd=new TextField();
	System.out.println(dd.text);
	System.out.println(dd.click);
	dd.getText();
}
}
