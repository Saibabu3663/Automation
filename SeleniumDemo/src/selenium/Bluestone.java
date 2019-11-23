package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone  {
	public static void main(String []args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.className("signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("userName")).sendKeys("marvel",Keys.ENTER);
		driver.findElement(By.id("email")).click();
				
		/*driver.findElement(By.name("password")).sendKeys("hemanth1997",Keys.ENTER);*/
	}

}
