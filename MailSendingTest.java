package assignment.Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.SenderLoginPage;
import resource.Base;

@Test

public class MailSendingTest extends Base{
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
					
			pageObject.MailSendingPage msp = new pageObject.MailSendingPage(driver);
			msp.clickNewMail().click();
            msp.getRecieverId().sendKeys("Monkeysorus11@zoho.in");
            msp.clickAttachment().click();
            
	}

}
