package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javalaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

				
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(100);
		WebElement search =driver.findElement(By.name("q"));
		Thread.sleep(100);
		search.clear();
		search.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(100);
		driver.navigate().back();
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		
		
		
	
		

}
	}
