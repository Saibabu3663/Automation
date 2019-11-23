package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mutliple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		
		Thread.sleep(100);
		driver.get("https://mail.google.com/mail/\r\n" +""); 
				
		
		Thread.sleep(100);
		driver.get("https://www.google.com/");
		
		Thread.sleep(100);
	}}