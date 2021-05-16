package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_KeybordInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx";
		driver.get(Url);
		WebElement Username=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		Username.sendKeys("Tester");
		WebElement Password=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
		Password.sendKeys("test");
		//Password.sendKeys(Keys.ENTER);
		Password.sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
		
	}

}
