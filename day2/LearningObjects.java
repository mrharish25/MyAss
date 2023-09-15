package week1.day2;

public class LearningObjects {

	public String launchbrowser(String browsername) {
		System.out.println("Browser launched successfully :" +browsername);
        return browsername;

	}
	public void loadurl() {
		System.out.println("App url loaded successfully");
	}  public static void main(String[] args) {
		LearningObjects detail=new LearningObjects();
		detail.launchbrowser("chrome");
		detail.loadurl();
		
	}
	
}
