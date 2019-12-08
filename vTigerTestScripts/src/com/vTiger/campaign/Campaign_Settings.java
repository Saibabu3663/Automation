package com.vTiger.campaign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Campaign_Settings {

	public static void main(String[] args) throws InterruptedException {
		 /*Launch the browser*/
		WebDriver driver=new ChromeDriver();
		/*maximize the browser*/
		driver.manage().window().maximize();
		/*Step 1: Launch the Application*/
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		/*verify the login page*/
		String expLoginTitle="vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
		String actLoginTitle = driver.getTitle().replaceAll(" ", "");
		if(actLoginTitle.equals(expLoginTitle))
		{
			System.out.println("Login page is displayed--->pass");
		}
		else
			System.out.println("Login page is not displayed--->fail");
		/*Step 2:Login to vTiger application*/
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value='Login'])[2]")));
		driver.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
		/*verify the home page*/
		String expHomePageTitle=" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
		String actHomePageTitle = driver.getTitle().replaceAll(" ", "");
		if(actHomePageTitle.equals(expHomePageTitle))
		{
			System.out.println("Home page is displayed--->pass");
		}
		else
			System.out.println("Home page is not displayed-->fail");
		/*Step 3:click on more and click on "CAMPAINGNS" link*/
		WebElement moreLink = driver.findElement(By.linkText("More"));
		Actions act = new Actions(driver);
		act.moveToElement(moreLink).perform();
		driver.findElement(By.linkText("Campaigns")).click();
		
		/*Verify the Campaigns Page*/
		
		String expCampaignPageTitle = " Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
		String actCampaingPageTitle = driver.getTitle().replaceAll(" ", "");
		
		if(actCampaingPageTitle.equals(expCampaignPageTitle))
			System.out.println("Campaign Page is displayed ==> Pass");
		else
			System.out.println("Campaign Page is not displayed ==> Fail");
		/*Step 4:Click on Campaign settings icon */
		driver.findElement(By.xpath("//img[@title=\"Campaigns Settings\"]")).click();
		/*step 5:Click on Layout editor*/
		driver.findElement(By.xpath("//a[contains(text(),'Layout Editor')]")).click();
		WebElement userImg = driver.findElement(By.xpath("//img[contains(@src,'user')]"));
		act.moveToElement(userImg).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(5000);
		
		
		/*Verify the LogOut Successful*/
		String expLogoutTitle = "vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
	
		String actLogoutTitle = driver.getTitle().replaceAll(" ", "");
		if(actLogoutTitle.equals(expLogoutTitle))
		{
			System.out.println("LogOut is Successful ==> Pass");
		}
		else
			System.out.println("LogOut is not Successful ==> Fail");
		
		/*Close the Browser*/		
		driver.close();	
		
	}

}
