package WebDriver_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hanlding_EdgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		String Url = "https://www.selenium.dev/downloads/";
		driver.get(Url);
	}

}
