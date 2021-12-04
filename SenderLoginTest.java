package assignment.Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.SenderLoginPage;
import resource.Base;


	public class SenderLoginTest extends Base{
		
		@Test
		public void initialize() throws IOException, InterruptedException
		{
			 driver =initializeDriver();
			 driver.get("https://accounts.zoho.in/signin?servicename=VirtualOffice&signupurl=https://www.zoho.com/workplace/pricing.html");
			 Thread.sleep(2000);
			 SenderLoginPage slp = new SenderLoginPage(driver);
				//Login with valid user credentials
				        
						slp.getMailId().sendKeys("Donkeysorus11@zoho.in");
						slp.clickNext().click();
						slp.getPassword().sendKeys("Donkeyzz@1234");
						slp.clickLogin().click();
		}
		//@Test
		//public void SenderLoginPage(){
			
		
