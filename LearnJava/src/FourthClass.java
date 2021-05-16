import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class FourthClass {

	@BeforeSuite
	public void prerequisitetest(){
		System.out.println("Pre conditon");
	}
	@AfterSuite
	public void closetestsuite(){
		System.out.println("DB closed");
	}
}
