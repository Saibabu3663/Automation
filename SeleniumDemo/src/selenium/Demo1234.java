package selenium;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1234 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent + "p");
		Set<String>wins=driver.getWindowHandles();//parent and child opens closes;
		Thread.sleep(2000);
		//wins.remove(parent);//remove only all execpt parent
		for(String win : wins) {
			System.out.println(win + "c");
			Thread.sleep(2000);
			driver.switchTo().window(win).close();
		}
		
		
		
		
		
		
	}

}

