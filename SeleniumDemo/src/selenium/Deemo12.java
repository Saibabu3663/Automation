package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deemo12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=23531&wExp=N&gclid=Cj0KCQiA5dPuBRCrARIsAJL7oegFTHqzPwc_6o84xBr7dbQnzGw80gbZUGHatpPtlLagH-MPwUbQTOUaAkKbEALw_wcB");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
