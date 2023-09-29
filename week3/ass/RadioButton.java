package week3.ass;

public class RadioButton extends Button {
	public void electRadioButton() {

		System.out.println("ON");

	}
public static void main(String[] args) {
	RadioButton dd=new RadioButton();
	System.out.println(dd.text);
	System.out.println(dd.click);
	dd.submit();
	dd.electRadioButton();
}
}
