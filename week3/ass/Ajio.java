package week3.ass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded']"));
		int totallist=list.size();
		System.out.println(totallist);
		
		Thread.sleep(6000);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='brand']"));
		int totallist1=list1.size();
		for (int i = 0; i < totallist1; i++) {
			System.out.println(list1.get(i).getText());
			
		Thread.sleep(6000);
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int totallist2=list2.size();
		for (int j = 0; j < totallist2; j++) {
			System.out.println(list2.get(j).getText());
		

		}
		}
	}
}