package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//PageFactory
	@FindBy (xpath="//input[@id='ctl00_MainContent_username']")
	WebElement usernameaddress;
	@FindBy (xpath="//input[@id='ctl00_MainContent_password']")
	WebElement passwordaddress;
	@FindBy (xpath="//input[@id='ctl00_MainContent_login_button']")
	WebElement loginbutton;
	
 
 //2nd Step-Declaring the WebDriver
 WebDriver driver;
 //3rd Step Creation of Constructor 
 public LoginPage(WebDriver dri){
	 driver=dri;
	 PageFactory.initElements(driver, this);
 }
//4th Step-Defining the activity for all the Objects captured.
 public void enterusername(String usernamedata){
	 usernameaddress.sendKeys(usernamedata);
 }
 public void enterpassword(String passwordata){
	passwordaddress.sendKeys(passwordata);
 }
 public void clicklogin(){
	loginbutton.click();
 }
}
