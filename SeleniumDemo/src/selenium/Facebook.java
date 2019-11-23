package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String []args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("email")).sendKeys("");
		//driver.findElement(By.name("pass")).sendKeys("");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("u_0_b")).click();
		/*WebElement email=driver.findElement(By.xpath());
		//System.out.println(email.getText());*/
		driver.findElement(By.xpath("//input[@type=\'email\']"));
		//driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email.getText());
         WebElement d=driver.findElement(By.id("email"));
         Thread.sleep(2000);
         d.sendKeys("sc.getText()");

	}

}
