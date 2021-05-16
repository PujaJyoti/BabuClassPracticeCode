package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Handling_IE_Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternetExplorerOptions iexp=new InternetExplorerOptions();
	
		//iexp.addArguments("--incognito");
		WebDriver driver = new InternetExplorerDriver(iexp);
		driver.manage().window().maximize();
		String Url = "https://www.facebook.com/";
		driver.get(Url);
		System.out.println(driver.getTitle());
	}

}
