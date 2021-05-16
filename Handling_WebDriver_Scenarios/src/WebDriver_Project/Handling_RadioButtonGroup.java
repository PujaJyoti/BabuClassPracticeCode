package WebDriver_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_RadioButtonGroup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "http://www.echoecho.com/htmlforms10.htm";
		driver.get(Url);
		List<WebElement> group2element = driver.findElements(By.name("group2"));
		group2element.get(0).click();
		Thread.sleep(3000);
		//System.out.println(group2element.size());
		for (int i = 0; i < group2element.size(); i++) {
			System.out.println(group2element.get(i).getAttribute("value")+"  "+group2element.get(i).getAttribute("checked") );	
		}
		
	}

}
