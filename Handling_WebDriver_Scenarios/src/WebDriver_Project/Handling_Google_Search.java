package WebDriver_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Google_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://www.google.com/";
		driver.get(Url);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("nayantharara");
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//ul[@class='erkvQe']"));
		List<WebElement> listsofoptions = driver.findElements(By.tagName("li"));
		for (int x = 0; x < listsofoptions.size(); x++) {
			String data = listsofoptions.get(x).getText();
			System.out.println(data);
		}
		
		
	}

}
