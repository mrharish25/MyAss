package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Lists;

public class Face {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://www.facebook.com");
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		int totalsize=tags.size();
		System.out.println("Total"+totalsize);
		for (int i = 0; i < totalsize; i++) {
			System.out.println(tags.get(i).getText());
		}
		
	}

}
