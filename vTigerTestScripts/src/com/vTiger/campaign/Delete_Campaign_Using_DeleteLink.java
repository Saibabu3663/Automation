package com.vTiger.campaign;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_Campaign_Using_DeleteLink {

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
		
		/*Step 3:click on product link */
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Produc')]")).click();
		/*fill product details*/
		String proName="keyboard";
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(proName);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		/*verify the created product page*/
		String createdproName=driver.findElement(By.xpath("//span[contains(text(),'Product Information')]")).getText();
	
		if(createdproName.contains(proName))
		{
			System.out.println("Product is displayed--->pass");
		}
		else
			System.out.println("product is not displayed--->fail");
		/*Step 4:click on more and click on "CAMPAINGNS" link*/
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
		
		/*Step 5: click on"+" image button to create new campaign*/
		
		driver.findElement(By.xpath("//img[contains(@title,'Create Campaign')]")).click();
		/*Verify the Create new Campaign page*/
		String expCreateCampPageTitle = " Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM".replaceAll(" ", "");
		String actCreateCampPageTitle = driver.getTitle().replaceAll(" ", "");
		
		if(actCreateCampPageTitle.equals(expCreateCampPageTitle))
			System.out.println("Create new Campaing Page is displayed ==> Pass");
		else
			System.out.println("Create new Campaing Page is not displayed ==> Fail");
		
		/*Step 6 : fill all the Mandatory Fields i.e name and Save*/
		String campaignName = "Campaign";
		driver.findElement(By.name("campaignname")).sendKeys(campaignName);
		driver.findElement(By.xpath("//img[contains(@title,'Select')]")).click();
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> i=windows.iterator();
		 String pid = i.next();
		 String cid = i.next();
		 driver.switchTo().window(cid);
		 driver.findElement(By.linkText("keyboard")).click();
		 driver.switchTo().window(pid);
		 driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		 
		String createdCamName = driver.findElement(By.xpath("//span[contains(text(),'Campaign Information')]")).getText();
		   
		if(createdCamName.contains(campaignName))
			System.out.println("Campaign is Created Successfully ==> Pass");
		else
			System.out.println("Campaign is not Created Successfully ==> Fail");
		/*step 7:delete the campaign using delete link  */
		driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
	
		driver.findElement(By.xpath("//a[contains(text(),'del')]")).click();
		Alert art=driver.switchTo().alert();
		art.accept();
		/*Step 8 : Logout*/
		WebElement userImg = driver.findElement(By.xpath("//img[contains(@src,'user')]"));
		act.moveToElement(userImg).perform();
		driver.findElement(By.linkText("Sign Out")).click();
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
