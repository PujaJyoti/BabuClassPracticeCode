package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Mouse_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://uasc.com/";
		driver.get(Url);
	WebElement parent=	driver.findElement(By.xpath("//*[@id='undefined-sticky-wrapper']/div/div/nav/ul/li[1]/a"));
	Actions action=new Actions(driver);
	action.moveToElement(parent).build().perform();
	WebElement child=	driver.findElement(By.xpath("//*[@id='undefined-sticky-wrapper']/div/div/nav/ul/li[1]/ul/li[2]/a"));
	child.click();
	
	
	}

}
