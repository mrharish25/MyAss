package week3.ass;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {

		System.out.println("Correct");

	}
public static void main(String[] args) {
	CheckBoxButton dd=new CheckBoxButton();
	System.out.println(dd.text);
	System.out.println(dd.click);
	dd.submit();
	dd.clickCheckButton();
}
}
