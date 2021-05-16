package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Handling_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver =new SafariDriver();
		String Url = "https://www.selenium.dev/downloads/";
		driver.get(Url);
		driver.close();
	}

}
