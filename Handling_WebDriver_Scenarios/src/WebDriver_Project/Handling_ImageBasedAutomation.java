package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Handling_ImageBasedAutomation {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx";
		driver.get(Url);
		Screen sc=new Screen();
		Pattern pc=new Pattern("/Users/pujakumari/Documents/workspace/Handling_WebDriver_Scenarios/src/WebDriver_Project/Image/Username.png");
		sc.type(pc,"Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		/*Pattern pk=new Pattern("Users/pujakumari/Documents/workspace/Handling_WebDriver_Scenarios/src/WebDriver_Project/Image/Pass.png");
		sc.type(pk,"test");*/
		Pattern pn=new Pattern("/Users/pujakumari/Documents/workspace/Handling_WebDriver_Scenarios/src/WebDriver_Project/Image/Logout.png");
		sc.click(pn);
	}

}
