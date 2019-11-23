package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		//driver.findElement(By.xpath())
		
		List<WebElement> d = driver.findElements(By.xpath("//ul[@class=\"_114Zhd\"]"));
		for (WebElement k : d) {
			System.out.println(k.getText());
			
		}
		
		
	}
	
}
