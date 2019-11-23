package selenium;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12345{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent + "p");
		
		Set<String>wins=driver.getWindowHandles();//
		/*Thread.sleep(2000);
		wins.remove(parent);//remove all child in reverse
		for(String win : wins) {
			System.out.println(win + "c");
			Thread.sleep(2000);
			driver.switchTo().window(win).close() ; */
	ArrayList<String> lst=new ArrayList<>(wins);
	System.out.println(lst.addAll(wins));
	for(int i=lst.size()-1;i>=0;i--) {
		driver.switchTo().window(lst.get(i)).close();
	}
			
		
		
		
		
		
		
		
	}

}

