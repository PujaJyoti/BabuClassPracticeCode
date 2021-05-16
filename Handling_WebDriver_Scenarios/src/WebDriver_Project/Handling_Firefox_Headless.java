package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Handling_Firefox_Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions fox=new FirefoxOptions();
		fox.setHeadless(true);
		//fox.addArguments("--headless");
		//fox.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fox);
		driver.manage().window().maximize();
		String Url = "https://www.facebook.com/";
		driver.get(Url);
		System.out.println(driver.getTitle());
	}

}
