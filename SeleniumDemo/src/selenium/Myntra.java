package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("shirt",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@title=\"Roadster Men Blue Regular Fit Printed Casual Shirt\"]")).click();
		Set<String> wins = driver.getWindowHandles();
		for (String w : wins) {
			driver.switchTo().window(w);
			
			
		}
	
	}}


