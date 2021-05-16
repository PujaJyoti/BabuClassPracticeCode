package WebDriver_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://jqueryui.com/droppable/";
		driver.get(Url);
		driver.switchTo().frame(0);
		WebElement parent=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement child=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(parent, child).build().perform();
		
	}

}
