import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstCase extends FourthClass {
	@BeforeClass
	//@BeforeMethod
	public void setup(){
		System.out.println("Open Browser");
	}
	@Test(priority=1)
	public void dologintest(){
		System.out.println("do login ");
	}
	@Test(enabled=false)
	public void doregistrationtest(){
		System.out.println("Please registratrate");
	}
	@Test(priority=2)
	public void contactustest(){
		System.out.println("Please rech to contacts");
	}
	@AfterClass
	//@AfterMethod
	public void close(){
		System.out.println("Browser close");
	}
}
