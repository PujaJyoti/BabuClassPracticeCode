package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class TestUtils extends TestBase{
	
	public static void doLogin(String usernamedata ,String passwordata){
		WebElement username=getObject("username");
		username.sendKeys(usernamedata);
		WebElement password=getObject("password");
		password.sendKeys(passwordata);
		WebElement login=getObject("login");
		login.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement logout=getObject("logout");
	   if(logout.isDisplayed()){
		   isloggedin=true;
	   }
	   else{
		   isloggedin=false;
	   }
		
	}
	
	public static boolean isSkip(String inputtestcase){
		//System.out.println(xlsread.getRowCount("suites"));
		//System.out.println(xlsread.getColumnCount("suites"));
		//System.out.println(xlsread.getCellData("suites", 1, 3));
		//String inputtestcase="LoginTestCase";
		for(int rownum=2;rownum<=xlsread.getRowCount("suites");rownum++){
			if(inputtestcase.equals(xlsread.getCellData("suites",0,rownum))){
				if(xlsread.getCellData("suites",2,rownum).equals("Y")){
					//System.out.println("Run the test case");
					return true;
				}
				else{
					//System.out.println("Skip the test case");
					return false;
				}
			}	
			}
		return false;
		}
	}

