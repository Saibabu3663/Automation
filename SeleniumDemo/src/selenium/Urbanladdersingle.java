package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladdersingle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[@data-gaaction=\"popup.auth.close\"]")).click();

		WebElement dining = driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]"));

		System.out.println(dining.getText());
		WebElement store = driver.findElement(By.xpath("//ul[@ class=\"featuredLinksBar__contact-links\"]"));

	
	
	
}
}
