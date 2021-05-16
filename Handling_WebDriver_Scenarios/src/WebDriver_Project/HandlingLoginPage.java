package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?";
		driver.get(Url);
		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		username.sendKeys("Tester");
		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		password.sendKeys("test");
		WebElement Login = driver.findElement(By.id("ctl00_MainContent_login_button"));
		Login.click();
		WebElement Logout=driver.findElement(By.xpath("//*[@id='ctl00_logout']"));
		if(Logout.isDisplayed()){
			System.out.println("Login is successfull");
		}
		else{
			System.out.println("Login is not successfull");
		}
	}

}
