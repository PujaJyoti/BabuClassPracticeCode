package WebDriver_Project;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Back_Forward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriver driver = new ChromeDriver();
		String Url = "https://www.selenium.dev/downloads/";
		driver.get(Url);
		WebElement documentation=driver.findElement(By.xpath("//a[@href='https://selenium.dev/documentation/en/grid/']"));
		documentation.click();
		driver.navigate().back();*/
		
		/*---------Alert Pop Up----------
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/ ");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]  ")).click();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert newwindow=driver.switchTo().alert();
		String popuptext=newwindow.getText();
		System.out.println(popuptext);
		newwindow.accept();*/
		
		/*----Handle Drop Down----
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	WebElement dropdown=	driver.findElement(By.xpath("//select[@name='country']"));
	dropdown.sendKeys("ARGENTINA");
	List<WebElement> countrylist= driver.findElements(By.tagName("option"));
	System.out.println("Country List Size:"+countrylist.size());
	for(int i=0;i<countrylist.size();i++){
		System.out.println(countrylist.get(i).getText());*/
		
		//----Handle Count
		
	}
	


}
