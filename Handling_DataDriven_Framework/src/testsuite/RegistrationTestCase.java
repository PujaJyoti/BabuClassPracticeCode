package testsuite;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import base.TestBase;
import junit.framework.Assert;
import utils.TestUtils;

public class RegistrationTestCase extends TestBase{

	@Before
	public void setup() throws IOException{
		doInitilization();
		boolean executablecondition= TestUtils.isSkip("RegistrationTestCase");
		if(executablecondition==false){
			Assert.assertTrue(false);
		}
	}
	@Test
	public void verifyRegistrationTest(){
		driver.get(configprop.getProperty("url"));
		TestUtils.doLogin("Tester", "test");
		WebElement order=getObject("order");
		order.click();
		WebElement quantity=getObject("quantity");
		quantity.sendKeys("1");
		WebElement customername=getObject("customername");
		customername.sendKeys("PUJA");
		WebElement street=getObject("street");
		street.sendKeys("LOHA");
		WebElement city=getObject("city");
		city.sendKeys("PATNA");
		WebElement state=getObject("state");
		state.sendKeys("BIHAR");
		WebElement zip=getObject("zip");
		zip.sendKeys("800003");
		WebElement card=getObject("card");
		card.click();
		WebElement cardnumber=getObject("cardnumber");
		cardnumber.sendKeys("123456");
		WebElement expiry=getObject("expiry");
		expiry.sendKeys("12/12");
		WebElement process=getObject("process");
		process.click();
		WebElement orderlabel=getObject("orderlabel");
		String actualOrderLabel=orderlabel.getText();
		System.out.println(actualOrderLabel);
		String expectedOrderLabel="Order";
		Assert.assertEquals(expectedOrderLabel, actualOrderLabel);
	
		
		
	}	
	
}
