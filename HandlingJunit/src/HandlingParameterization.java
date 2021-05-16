import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HandlingParameterization {
	String userName;
	String password;
	public HandlingParameterization(String user,String pass){
		userName=user;
		password=pass;
		
	}
@Test
public void loginTest(){
	System.out.println(userName);
	System.out.println(password);
}
@Parameters
public static Collection<String[]>getData(){
	String s[][]=new String [3][2];
	s[0][0]="Ram";
	s[0][1]="Mani";
	s[1][0]="Kalai";
	s[1][1]="Juli";
	s[2][0]="A1PUJA";
	s[2][1]="Patna@12";
	return Arrays.asList(s);
}
}
