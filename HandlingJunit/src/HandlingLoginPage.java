import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HandlingLoginPage {

	@Test
	public void logintest() {

		System.out.println("Do Login");

	}

	@AfterClass
	public static void closerbrowser() {
		System.out.println("Close Browser");
	}

	@BeforeClass
	public static void openbrowser() {
		System.out.println("Open Browser");
	}

	@Ignore
	@Test
	public void registrationtest() {
		System.out.println("Enter Details of Page");

	}

	@Test
	public void homepge() {
		System.out.println("After Loginuser on HomePage");
	}

}
