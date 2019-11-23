package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demogmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");

				
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("hemanthkumarav20");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		
		
		driver.findElement(By.name("password")).sendKeys("hemanth1997",Keys.ENTER);
		
		/*WebElement log=driver.findElement(By.id("loginbutton"));
		log.click();
		
		*/
				
		
		
	
		

}
	}
