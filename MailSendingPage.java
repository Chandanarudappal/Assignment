package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class SendingPage extends Base {
	By NewMail = By.xpath("//*[@id=\"zm_lftree\"]/div[1]/span");
	By ToId = By.className("zm_sgst");
	By Subject = By.xpath("//*[@id=\"zmsub_Cmp1\"]");
        By Attacher = By.className("zei-attachment");
	By Drag = By.xpath("//*[@id=\"zmAttachCompWhtPopup_tabPopupDialog\"]/div/div[1]/div[3]/div[1]/div[2]/div");
	By Send = By.xpath("//*[@id=\"jsMSCenterIcon\"]/ul[1]/li/b/span/span");
	
	
	
	public SendingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement clickNewMail() {
		//TODO Auto-generated method stub
		return driver.findElement(NewMail);
	}
	public WebElement getToId() {
		//TODO Auto-generated method stub
		return driver.findElement(ToId);
		
	}
	public WebElement getSubject() {
		//TODO Auto-generated method stub
	 return driver.findElement(Subject);
		
	}
	
	public WebElement clickAttacher() {
		//TODO Auto-generated method stub
	  return driver.findElement(Attacher);
		
	}
	public WebElement clickDrag() {
		return driver.findElement(Drag);
		
	}
	//public WebElement clickupload( ) {
		//return driver.findElement(upload);
	
	//}
	
	public WebElement clickSend() {
		return driver.findElement(Send);
		
	}
}
