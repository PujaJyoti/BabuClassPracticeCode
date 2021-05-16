package WebDriver_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Handling_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(screenshotfile,new File("/Users/pujakumari/Documents/workspace/Handling_WebDriver_Scenarios/TakesScreenhoot.png"));
			
		
	}

}
