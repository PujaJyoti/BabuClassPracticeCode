import org.testng.annotations.Test;

public class Handling_InvocationCount {
@Test(invocationCount=3,description="Check Login Code")
public void doLoginTest(){
	System.out.println("Login Completed");
}
	
}
