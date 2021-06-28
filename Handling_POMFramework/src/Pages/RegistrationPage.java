package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	@FindBy(xpath="//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
	WebElement product;
	@FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
	WebElement orderbutton;
	@FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_txtName']")
	WebElement customername;
	@FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
	WebElement street;
	@FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
	WebElement city;
	WebDriver driver;
	 //3rd Step Creation of Constructor 
	public RegistrationPage(WebDriver dri){
		 driver=dri;
		 PageFactory.initElements(driver, this);
	 }
	public void enterproduct(String productdata){
		product.sendKeys(productdata);
	}
	public void enterorder(String orderdata){
		orderbutton.sendKeys(orderdata);
	}
	public void entercustomername(String customerdata){
		customername.sendKeys(customerdata);
	}
	public void enterstreet(String streetdata){
		street.sendKeys(streetdata);
	}
	public void entercity(String citydata){
		city.sendKeys(citydata);
	}
}
