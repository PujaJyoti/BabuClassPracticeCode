package Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HomePageTest.class, LoginTest.class, RegistrationPgaeTest.class })
public class AllTests {

}
