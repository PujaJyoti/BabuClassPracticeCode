package Jenkins_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		String Url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx";
		driver.get(Url);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
		/*
		 * String Nametext = driver.findElement(By.xpath(
		 * "//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]"))
		 * .getText(); System.out.println(Nametext);
		 */

		/*
		 * 2nd Scenario String
		 * prexpath="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr["; String
		 * postxpath="]/td[2]"; for(int i=2;i<=9;i++){ String
		 * Namestext=driver.findElement(By.xpath(prexpath+i+postxpath)).getText(
		 * ); System.out.println(Namestext);
		 */
		/*
		 * 3rd Scenario String
		 * prexpath="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[";
		 * String postxpath="]"; for(int i=2;i<=12;i++){ String
		 * Namestext=driver.findElement(By.xpath(prexpath+i+postxpath)).getText(
		 * ); System.out.println(Namestext);
		 */

		String LeftBoundary = "//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[";
		String MiddleBoundary = "]/td[";
		String RightBoundary = "]";
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 12; j++) {
				String Namestext = driver.findElement(By.xpath(LeftBoundary + i + MiddleBoundary + j + RightBoundary))
						.getText();
				System.out.println(Namestext);
			}
		}

	}

}
