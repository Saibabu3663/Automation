package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		WebElement ac=driver.findElement(By.className("textfield"));
		ac.sendKeys("admin",Keys.ENTER);
		WebElement a=driver.findElement(By.name("pwd"));
		a.sendKeys("manager",Keys.ENTER);

		
		
		
		
	}
	}
		
		