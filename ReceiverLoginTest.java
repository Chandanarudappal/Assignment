package assignment.Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.ReceiverLoginPage;
import resource.Base;

public class ReceiverLoginTest extends Base {


		
		@Test
		public void initialize() throws IOException, InterruptedException
		{
			 driver =initializeDriver();
			 driver.get("https://accounts.zoho.in/signin?servicename=VirtualOffice&signupurl=https://www.zoho.com/workplace/pricing.html");
			 Thread.sleep(2000);
			 ReceiverLoginPage rlp = new ReceiverLoginPage(driver);
				//Login with valid user credentials
				        
						rlp.getMailId().sendKeys("Donkeysorus11@zoho.in");
						rlp.clickNext().click();
						rlp.getPassword().sendKeys("Donkeyzz@1234");
						rlp.clickLogin().click();
						Thread.sleep(20000);
						rlp.clickInbox().click();
						Thread.sleep(3000);
						
		}
}
		
					

