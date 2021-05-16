package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Handling_EdgeHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions iexp=new EdgeOptions();
		//iexp.addArguments("--Headless");
		//iexp.addArguments("--incognito");
		WebDriver driver = new EdgeDriver(iexp);
		driver.manage().window().maximize();
		String Url = "https://www.facebook.com/";
		driver.get(Url);
		System.out.println(driver.getTitle());
	}

}
