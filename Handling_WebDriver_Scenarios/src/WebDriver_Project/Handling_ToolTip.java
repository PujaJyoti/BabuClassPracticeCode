package WebDriver_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://demoqa.com/tool-tips";
		driver.get(Url);
		WebElement ele=driver.findElement(By.xpath("//*[@id='toolTipButton']"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println(ele.getAttribute("title"));
	}

}
