package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_New_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://www.google.com/";
		driver.get(Url);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("nayantharara");
		Thread.sleep(10000);
		String beforepath="/html/body/div[2]/div[3]/form/div[2]/div[";
		String afterpath="]/div[2]/div[2]/ul/li[2]";
		int i=1;
	try{
		while(true){
			String data=driver.findElement(By.xpath(beforepath+i+afterpath)).getText();
			System.out.println(data);
			i++;
			
		}
		}
		catch(Exception e){
			System.out.println("End");
		}
	}

}


