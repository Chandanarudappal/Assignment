package assignment.Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.SenderLoginPage;
import pageObject.SendingPage;
import resource.Base;

public class SendingTest extends Base{
@Test

	
	public void initialize() throws IOException, InterruptedException
	{
		 driver =initializeDriver();
		 driver.get("https://accounts.zoho.in/signin?servicename=VirtualOffice&signupurl=https://www.zoho.com/workplace/pricing.html");
		 Thread.sleep(2000);
         SenderLoginPage slp = new SenderLoginPage(driver);
			//Login with valid user credentials
			        
					slp.getMailId().sendKeys("Yeaaahoooo11@zoho.in");
					slp.clickNext().click();
					Thread.sleep(5000);
					slp.getPassword().sendKeys("Yeaho@1234");
					slp.clickLogin().click();
					Thread.sleep(20000);
	 
		    SendingPage sp= new SendingPage(driver);
			sp.clickNewMail().click();
            sp.getToId().sendKeys("Monkeysorus11@zoho.in");
            sp.getSubject().sendKeys("submitting document");
            Thread.sleep(3000);
            sp.clickAttacher().click();
            Thread.sleep(5000);
            sp.clickDrag().click();
	    Thread.sleep(3000);
            sp.clickAttach().click();
            Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\fileupload.exe");
            Thread.sleep(3000);
            sp.clickSend().click();
	    sp.clickMyProfile().click();
            Thread.sleep(3000);
            sp.clickSignOut().click();
	}

}

