package testsuite;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import base.TestBase;
import junit.framework.Assert;
import utils.TestUtils;

public class ForgotPasswordTestCase extends TestBase{

	@Before
	public void setup() throws IOException{
		doInitilization();
		boolean executablecondition= TestUtils.isSkip("ForgotPasswordTestCase");
		if(executablecondition==false){
			Assert.assertTrue(false);
		}
	}
	@Test
	public void verifyForgotPassword(){
		System.out.println("Forgot Password Page");
	}
	
}
