package WebDriver_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MultipleSelect_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "http://output.jsbin.com/osebed/2";
		driver.get(Url);
		WebElement multiselectdrop=driver.findElement(By.xpath("//*[@id='fruits']"));
		Select oselect=new Select(multiselectdrop);
		//oselect.selectByIndex(2);
		//oselect.selectByValue("apple");
		oselect.selectByVisibleText("Orange");
		oselect.selectByVisibleText("Grape");
		oselect.selectByVisibleText("Banana");
		oselect.deselectAll();
		List<WebElement>optionslist=oselect.getOptions();
		for(int i=0;i<optionslist.size();i++){
			System.out.println(optionslist.get(i).getText());
		}
		
		
		
	}

}
