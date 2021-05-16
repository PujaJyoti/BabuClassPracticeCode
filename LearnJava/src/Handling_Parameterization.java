import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Handling_Parameterization {

	@Test(dataProvider="getData")
	public void loginTest(String username,String password){
		System.out.println(username +" " +password);
		
	}
	@Test(dataProvider="getRegistrationData")
	public void doRegistrationTest(String firstname,String lastname,String address){
		System.out.println(firstname+ " "+lastname+" "+address);
	}
	@DataProvider
	public String[][] getData(){
		String [][]crediential=new String[2][2];
		crediential[0][0]="A1PUJA";
		crediential[0][1]="12345";
		crediential[1][0]="A1SWATI";
		crediential[1][1]="13456";
		return crediential;
	}
	@DataProvider
	public String[][] getRegistrationData(){
		String a[][]=new String[2][3];
		a[0][0]="firstname1";
		a[0][1]="lastname1";
		a[0][2]="address1";
		a[1][0]="firstname2";
		a[1][1]="lastname2";
		a[1][2]="address3";
		return a;
	}
	
	}

