import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {
@Test
public void datavalidationtest(){
	System.out.println("a");
	int expected=10;
	int actual=20;
	//Assert.assertEquals(expected, actual);
	SoftAssert obj=new SoftAssert();
	obj.assertEquals(expected, actual);
	System.out.println("b");
}
}
