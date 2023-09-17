package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	
	public static void main(String[] args) {
        
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shari25121997@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hari25");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		String title = driver.getTitle();
		
		String actual = "Facebook2";
		
		System.out.println(title);
		
		if (title.equals(actual)) {
			System.out.println("login succ");
			
		} else {
			System.out.println("login not succ");

		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}
