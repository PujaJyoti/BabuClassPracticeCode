import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Handling_FilteringTestCase {
	@BeforeGroups("Regression")
	public void setup() {
		System.out.println("SetupDone");
	}
	
	@Test(groups="Sanity")
	public void doRegistrationTest(){
		System.out.println("Registration Completed");
	}
	@Test(groups="Regression")
	public void dologinTest(){
		System.out.println("Login Completed");
	}
	@Test(groups="Sanity")
	public void getUserTest(){
		System.out.println("UserTest Completed ");
	}
	@Test(groups="Regression")
	public void getcourseTest(){
		System.out.println("getcourseTest Completed");
	}
	@Test(groups="Sanity")
	public void addPaymentTest(){
		System.out.println("addPaymentTest Completed");
	}
	@Test(groups="Regression")
	public void carttest(){
		System.out.println("carttest Completed");
	}
	@AfterGroups
	public void close(){
		System.out.println("Close the db");
	}
}
