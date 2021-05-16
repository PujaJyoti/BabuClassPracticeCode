package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ContactUsTestCase.class, ForgotPasswordTestCase.class, LoginTestCase.class,
		RegistrationTestCase.class })
public class AutomationPack {

}
