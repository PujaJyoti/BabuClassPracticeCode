package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hnadling_OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		String Url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?";
		driver.get(Url);
	
	}

}
