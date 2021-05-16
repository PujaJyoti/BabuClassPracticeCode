import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertiFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Read Data
	FileInputStream loads=new FileInputStream("/Users/pujakumari/Documents/workspace/HandlingFile/src/config.properties");
      Properties prop=new Properties();
		prop.load(loads);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("salary"));
		System.out.println(prop.getProperty("address"));
		
		//How to write Data
		FileOutputStream loadss=new FileOutputStream("/Users/pujakumari/Documents/workspace/HandlingFile/src/config.properties");
		prop.setProperty("city", "newdelhi");
		prop.setProperty("lastname", "kumari");
		prop.setProperty("gender", "female");
		prop.store(loadss, "Suceessfully entered and saved");
		
	}

}
