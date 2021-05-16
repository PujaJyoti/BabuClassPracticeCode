import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Handling_RegistrationPage {
@Before
public void setup(){
	System.out.println("Hi");


}
	@Test
	public void registationtest(){
		System.out.println("In Registration Page");
	}
	@Test
	public void closetest(){
		System.out.println("Already Registrated");
	}
	@After
	public void close(){
		System.out.println("Close");
	}
}

