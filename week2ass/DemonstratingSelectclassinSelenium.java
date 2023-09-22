package week2ass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingSelectclassinSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Haran");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("hari2512@yahoo.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("shh1234");
		
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("25");
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("12");
		
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
