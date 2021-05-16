package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://jqueryui.com/datepicker/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a")).click();
		driver.findElement(By.id("datepicker")).sendKeys("01/01/1999");
	}

}
