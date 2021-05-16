import org.testng.annotations.Test;

public class Handling_Timeout {

	@Test(timeOut=1000)
	public void dologinTest(){
		while(true){
			System.out.println("Login Succesfully");
		}
	}
}
