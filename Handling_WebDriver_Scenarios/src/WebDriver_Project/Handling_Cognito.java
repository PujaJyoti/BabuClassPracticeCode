package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_Cognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chrome=new ChromeOptions();
		//chrome.addArguments("--headless");
		chrome.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		String Url = "https://www.facebook.com/";
		driver.get(Url);
	}

}
