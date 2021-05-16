package WebDriver_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Handling_Screenshot_FailureCases {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://register.rediff.com/utilities/newforgot/index.php?FormName=showlogin";
		driver.get(Url);
		try{
		
		driver.manage().window().maximize();
		WebElement next=driver.findElement(By.name("nexts"));
		if(next.isDisplayed()){
			System.out.println("Is Displayed");
			next.click();
		}
		
		}
	catch(Exception e){
		System.out.println(e +"TestCase Failed");
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(screenshotfile,new File("/Users/pujakumari/Documents/workspace/Handling_WebDriver_Scenarios/FailedScreenshot.png"));
	}
		}
}
