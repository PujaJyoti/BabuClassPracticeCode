package WebDriver_Project;

import java.io.IOException;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handling_AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://demoqa.com/automation-practice-form";
		driver.get(Url);
		Thread.sleep(3000);
		WebElement choose=driver.findElement(By.xpath("//*[@id='uploadPicture']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", choose);
		Actions obj=new Actions(driver);
		obj.moveToElement(choose);
		obj.click();
		Action var=obj.build();
		var.perform();
		Runtime.getRuntime().exec("path");
		
		
		
		
		
	}

}
