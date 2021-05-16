package WebDriver_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_LinkCount {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
	}

}
