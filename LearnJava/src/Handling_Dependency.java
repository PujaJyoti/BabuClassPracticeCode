import org.testng.Assert;
import org.testng.annotations.Test;

public class Handling_Dependency {

	@Test(dependsOnMethods="doRegistrationTest")
	public void doLoginTest(){
		System.out.println("Login Test");
	}
	@Test
	public void doRegistrationTest(){
		int x=10;
		int y=20;
			Assert.assertEquals(x, y);
			System.out.println("Registration  Test");
	}
}
