package StepDefination;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	public static WebDriver driver;
	public static Properties configprop;
	public static Properties objrepoprop;
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     driver=new ChromeDriver();
	     FileInputStream config=new FileInputStream(System.getProperty("user.dir")+"/src/config/Config.properties");
		 configprop=new Properties();
		 configprop.load(config);
		 FileInputStream objrepo=new FileInputStream(System.getProperty("user.dir")+"/src/config/ObjectRepositories.properties");
		 objrepoprop=new Properties();
		 objrepoprop.load(objrepo);
		 
	}

	@Given("^Navigate to the url$")
	public void navigate_to_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get(configprop.getProperty("url"));
	}

	@When("^Enter the Username$")
	public void enter_the_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath(objrepoprop.getProperty("username"))).sendKeys("Tester");
	}

	@When("^Enter the Password$")
	public void enter_the_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("password"))).sendKeys("test");
	}

	@When("^Click on SignIn$")
	public void click_on_SignIn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath(objrepoprop.getProperty("login"))).click();
	}

	@Then("^Check the SignIn Successfull$")
	public void check_the_SignIn_Successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement logout=driver.findElement(By.xpath(objrepoprop.getProperty("logout")));
	   if(logout.isDisplayed()){
		   System.out.println("Successfull Login");
	   }
	   else{
		   System.out.println("Not Login");
	   }
	}

	@When("^Click on Order$")
	public void click_on_Order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath(objrepoprop.getProperty("order"))).click();
	}

	@When("^Enter Product$")
	public void enter_Product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Select osel=new Select(driver.findElement(By.xpath(objrepoprop.getProperty("product"))));
		osel.selectByVisibleText("FamilyAlbum");
	}

	@When("^Enter Quantity$")
	public void enter_Quantity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("quantity"))).sendKeys("1");
	}

	@When("^Enter CustomerName$")
	public void enter_CustomerName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("customername"))).sendKeys("Nayantara");
	}

	@When("^Enter Street$")
	public void enter_Street() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("street"))).sendKeys("JP Road");
	}

	@When("^Enter City$")
	public void enter_City() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("city"))).sendKeys("JP ");
	}

	@When("^Enter State$")
	public void enter_State() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("state"))).sendKeys("JP ");
	}

	@When("^Enter Zip$")
	public void enter_Zip() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("zip"))).sendKeys("1029");
	}

	@When("^Enter Card$")
	public void enter_Card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("card"))).sendKeys("1029134");
	}

	@When("^Enter CardNumber$")
	public void enter_CardNumber() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("cardnumber"))).sendKeys("1029134");
	}

	@When("^Click on Process$")
	public void click_on_Process() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("process"))).click();
	}

	@Then("^Check Order Created$")
	public void check_Order_Created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement orderlabel=driver.findElement(By.xpath(objrepoprop.getProperty("orderlabel")));
	    if(orderlabel.isDisplayed()){
	    	System.out.println("Order is Created");
	    }
	    else{
	    	System.out.println("No Order created");
	    }
	}
	@Given("^Navigate to the application \"([^\"]*)\"$")
	public void navigate_to_the_application(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get(url);
	}

	@When("^Enter username \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("username"))).sendKeys(username);
	}

	@When("^Enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("password"))).sendKeys(password);
	}



	@When("^Enter Quantity \"([^\"]*)\"$")
	public void enter_Quantity(String quantity) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("quantity"))).sendKeys(quantity);
	}

	@When("^Enter CustomerName \"([^\"]*)\"$")
	public void enter_CustomerName(String customerName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("customername"))).sendKeys(customerName);
	}

	@When("^Enter Street \"([^\"]*)\"$")
	public void enter_Street(String street) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("street"))).sendKeys(street);
	}

	@When("^Enter City \"([^\"]*)\"$")
	public void enter_City(String city) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("city"))).sendKeys(city);
	}

	@When("^Enter State \"([^\"]*)\"$")
	public void enter_State(String state) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("state"))).sendKeys(state);
	}

	@When("^Enter Zip \"([^\"]*)\"$")
	public void enter_Zip(String zip) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("zip"))).sendKeys(zip);
	}

	@When("^Enter Card \"([^\"]*)\"$")
	public void enter_Card(String card) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("card"))).sendKeys(card);
	}

	@When("^Enter CardNumber \"([^\"]*)\"$")
	public void enter_CardNumber(String cardNumber) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("cardnumber"))).sendKeys(cardNumber);
	}
	@When("^Click on Logout$")
	public void click_on_Logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("logout"))).click();
	}
	@When("^Click on View all products$")
	public void click_on_View_all_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("Viewallproducts"))).click();
	}
	@When("^Click on View all orders$")
	public void click_on_View_all_orders() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("Viewallorders"))).click();
	}
	//----Flipkart-----
	
	@Given("^Navigate to the flipkart application \"([^\"]*)\"$")
	public void navigate_to_the_flipkart_application(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("^Enter email for Filpkart \"([^\"]*)\"$")
	public void enter_email_for_Filpkart(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath(objrepoprop.getProperty("emailid"))).sendKeys(username);
	}

	@When("^Enter password for Flipkart \"([^\"]*)\"$")
	public void enter_password_for_Flipkart(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath(objrepoprop.getProperty("flipkartpassword"))).sendKeys(password);
	}

	@When("^Click on Flipkart SignIn$")
	public void click_on_Flipkart_SignIn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath(objrepoprop.getProperty("signin"))).click();
	}

	@Given("^Navigate to the Flipkart application url$")
	public void navigate_to_the_Flipkart_application_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(configprop.getProperty("flipkarturl"));
	}

	@When("^Click on ForgotPassword$")
	public void click_on_ForgotPassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("forgotpassword"))).click();
	}

	@When("^Enter Flipkart emailid$")
	public void enter_Flipkart_emailid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("forgotemail"))).sendKeys("a1.pujasingh1000@gmail.com");
	}

	@When("^Click on Flipkart Submitbutton$")
	public void click_on_Flipkart_Submitbutton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(objrepoprop.getProperty("submitbtn"))).click();
	}

	@Given("^Navigate to the application url$")
	public void navigate_to_the_application_url(DataTable url) throws Throwable {
		List<List<String>>list=url.raw();
		driver.get(list.get(0).get(0));
	}

	@When("^Enter username$")
	public void enter_username(DataTable uname) throws Throwable {
		List<List<String>>listuname=uname.raw();
		driver.findElement(By.xpath(objrepoprop.getProperty("username"))).sendKeys(listuname.get(1).get(1));
	}

	@When("^Enter password$")
	public void enter_password(DataTable pwd) throws Throwable {
		List<List<String>>listpwd=pwd.raw();
		driver.findElement(By.xpath(objrepoprop.getProperty("password"))).sendKeys(listpwd.get(0).get(0));
	   
	}
	
	
	//Optimization
	
	@Then("^verify Login is successful$")
	public void verify_Login_is_successful(DataTable logincredential) throws Throwable {
		List<List<String>>listcredential=logincredential.raw();
		driver.findElement(By.xpath(objrepoprop.getProperty("username"))).sendKeys(listcredential.get(0).get(0));
		driver.findElement(By.xpath(objrepoprop.getProperty("password"))).sendKeys(listcredential.get(0).get(1));
		driver.findElement(By.xpath(objrepoprop.getProperty("login"))).click();
		WebElement logout=driver.findElement(By.xpath(objrepoprop.getProperty("logout")));
		   if(logout.isDisplayed()){
			   System.out.println("Successfull Login");
		   }
		   else{
			   System.out.println("Not Login");
		   }
	}

	@When("^click on order$")
	public void click_on_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath(objrepoprop.getProperty("order"))).click();
	}

	@When("^submit the order$")
	public void submit_the_order(DataTable orderinputs) throws Throwable {
		List<List<String>>listdata=orderinputs.raw();
		driver.findElement(By.xpath(objrepoprop.getProperty("quantity"))).sendKeys(listdata.get(0).get(0));
		driver.findElement(By.xpath(objrepoprop.getProperty("customername"))).sendKeys(listdata.get(0).get(1));
		driver.findElement(By.xpath(objrepoprop.getProperty("street"))).sendKeys(listdata.get(0).get(2));
		driver.findElement(By.xpath(objrepoprop.getProperty("city"))).sendKeys(listdata.get(0).get(3));
		driver.findElement(By.xpath(objrepoprop.getProperty("state"))).sendKeys(listdata.get(0).get(4));
		driver.findElement(By.xpath(objrepoprop.getProperty("zip"))).sendKeys(listdata.get(0).get(5));
		driver.findElement(By.xpath(objrepoprop.getProperty("card"))).sendKeys(listdata.get(0).get(6));
		driver.findElement(By.xpath(objrepoprop.getProperty("cardnumber"))).sendKeys(listdata.get(0).get(7));
		driver.findElement(By.xpath(objrepoprop.getProperty("process"))).click();
	}

	@Then("^verify order is submited successfully$")
	public void verify_order_is_submited_successfully() throws Throwable {
		 WebElement orderlabel=driver.findElement(By.xpath(objrepoprop.getProperty("orderlabel")));
		    if(orderlabel.isDisplayed()){
		    	System.out.println("Order is Created");
		    }
		    else{
		    	System.out.println("No Order created");
		    }
	    
	}

}
