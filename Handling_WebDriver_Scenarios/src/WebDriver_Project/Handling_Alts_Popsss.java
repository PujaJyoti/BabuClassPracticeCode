package WebDriver_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alts_Popsss {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/ ");
	driver.findElement(By.xpath("//*[@id='signin_info']/a[1]  ")).click();
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	Alert newwindow=driver.switchTo().alert();
	String popuptext=newwindow.getText();
	System.out.println(popuptext);
	newwindow.accept();
	}
	
}
