package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("java");
	
		/* List<WebElement> sc = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		 //driver.findElement(By.xpath( "//ul[@class=\"erkvQe\"]/li")).click();
		 
		 
		for (WebElement w : sc) {
			System.out.println(w);*/
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class=\"jKWzZXdEJWi__suggestions-inner-container\"]/ancestor::ul")).click();
			
		}
		 
		 
			
			}
			 

			 
		
				
			 
				
			
		



