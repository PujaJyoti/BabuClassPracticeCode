package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Double_Click {

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
		Actions action=new Actions(driver);
		action.doubleClick(Login).build().perform();
	}

}
