package week3.ass;

public class Button extends WebElement {
	public void submit() {

		System.out.println("Button submit");

	}
public static void main(String[] args) {
	Button dd=new Button();
	System.out.println(dd.text);
	System.out.println(dd.click);
	dd.submit();
}
}
