package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath= "//a[contains(text(),'Logout')]")
	WebElement logoutbutton;
	@FindBy(xpath="//a[contains(text(),'Order')]")
	WebElement orderbutton;
	WebDriver driver;
	 //3rd Step Creation of Constructor 
	public HomePage(WebDriver dri){
		 driver=dri;
		 PageFactory.initElements(driver, this);
	 }
	public Boolean verifylogin(){
	boolean logout=	logoutbutton.isDisplayed();
	//System.out.println("Login is Successfull" + logout);
	return logout;
	}
	public void clickorder(){
		orderbutton.click();
	}
}
