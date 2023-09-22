package weekmarathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@class='sidebar-list-item']/a)[5]")).click();
		
		Thread.sleep(10000);
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name='genre']"));
        
		Select select = new Select(Dropdown);
        
		select.selectByVisibleText("ANIMATION");
		
		WebElement Dropdown1 = driver.findElement(By.xpath("//select[@name='lang']"));
		
		Select select1 = new Select(Dropdown1);
        
		select1.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//div[@class='form-group']/button")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		driver.findElement(By.xpath("//select[@name='cinemaName']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//option[@value='PVR Heritage RSL ECR Chennai']")).click();
		
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input")).click();
		
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		
		driver.findElement(By.xpath("//select[@name='timings']")).click();
		
		driver.findElement(By.xpath("//option[@value='09:00 AM - 12:00 PM']")).click();
		
		driver.findElement(By.name("noOfTickets")).sendKeys("5");
		
		driver.findElement(By.name("name")).sendKeys("Hari");
		
		driver.findElement(By.name("email")).sendKeys("shari25121997@gmail.com");
		
		driver.findElement(By.name("mobile")).sendKeys("8903538583");
		
		driver.findElement(By.xpath("//select[@name='food']")).click();
		
		driver.findElement(By.xpath("//option[@value='Yes']")).click();
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		String title = driver.getTitle();
		
		String actual = "Movie Libary";
		
		System.out.println(title);
		
		if (title.equals(actual)) {
			System.out.println("login succ");
			
		} else {
			System.out.println("login not succ");

		}
	}

}
