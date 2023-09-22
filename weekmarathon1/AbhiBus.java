package weekmarathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Bus")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chennai");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-id='Bangalore']")).click();
		
		driver.findElement(By.xpath("//a[text()='Today']")).click();
		
		driver.findElement(By.xpath("//div[@id='search-button']/a")).click();
		
		//driver.findElement(By.xpath("//a[@class='btn  outlined primary sm active button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='SU5']")).click();
		
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class='label']/p)[1]")).click();
		
		String title = driver.getTitle();
		
		String actual = "Chennai to Bangalore Bus Ticket Booking at AbhiBus";
		
		System.out.println(title);
		
		if (title.equals(actual)) {
			System.out.println("login succ");
			
		} else {
			System.out.println("login not succ");

		}

	}

}
