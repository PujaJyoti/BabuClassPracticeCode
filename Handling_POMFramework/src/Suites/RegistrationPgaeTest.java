package Suites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;

public class RegistrationPgaeTest {
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public RegistrationPage registrationpage;
	@Before
	public void setup(){
		//Initilization
		driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		registrationpage=new RegistrationPage(driver);
	}
	@Test
	public void enterOrderTest(){
		loginpage.enterusername("Tester");
		loginpage.enterpassword("test");
		loginpage.clicklogin();
		//homepage.verifylogin();
		homepage.clickorder();
		registrationpage.enterproduct("Family Album");
		registrationpage.enterorder("3");
		registrationpage.entercustomername("nayantara");
	
	}
}
