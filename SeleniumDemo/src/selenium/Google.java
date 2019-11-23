package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("ja");
		Thread.sleep(3000);
		 List<WebElement> sc = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for (WebElement  k: sc) {
			
		 
			System.out.println(k.getText());
			
		}
	}
}

