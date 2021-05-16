package testsuite;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import base.TestBase;
import junit.framework.Assert;
import utils.TestUtils;

public class LoginTestCase extends TestBase {
@Before
public void setup() throws IOException{
	doInitilization();
	boolean executablecondition= TestUtils.isSkip("LoginTestCase");
	if(executablecondition==false){
		Assert.assertTrue(false);
	}
}
	
	@Test
	public void verifyLoginTest(){
		driver.get(configprop.getProperty("url"));
		TestUtils.doLogin("Tester", "test");
		if(isloggedin==true){
			System.out.println("Login Success");
		}
		else{
			System.out.println("Login Failed");
		}
	}
	
	
}
