package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Handling_IEbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new InternetExplorerDriver();
		String Url = "https://www.selenium.dev/downloads/";
		driver.get(Url);
	}

}
