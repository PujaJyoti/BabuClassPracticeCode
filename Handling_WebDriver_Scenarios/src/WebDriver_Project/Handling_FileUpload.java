package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "http://demo.guru99.com/test/upload/";
		driver.get(Url);
		driver.findElement(By.name("uploadfile_0")).sendKeys("/Users/pujakumari/Documents/workspace/Demo/src/google.png");
		
	}

}
