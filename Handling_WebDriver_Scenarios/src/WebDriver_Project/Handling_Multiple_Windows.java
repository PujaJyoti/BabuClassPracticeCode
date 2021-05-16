package WebDriver_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://retail.sc.com/in/nfs/login.htm?timeout=1";
		driver.get(Url);
	Set<String>windows=	driver.getWindowHandles();
	Iterator<String> obj=windows.iterator();
	String mainwindowside= obj.next();
	System.out.println(mainwindowside);
	WebElement phone=	driver.findElement(By.xpath("//a[text()='Phone Banking']"));
	phone.click();
	Thread.sleep(3000);
	windows=driver.getWindowHandles();
	obj=windows.iterator();
	obj.next();
	String childwindowide=obj.next();
	System.out.println(childwindowide);
	driver.switchTo().window(childwindowide);
	driver.findElement(By.linkText("ABOUT US")).click();
	driver.switchTo().window(mainwindowside);
		
	
	
	}
}
