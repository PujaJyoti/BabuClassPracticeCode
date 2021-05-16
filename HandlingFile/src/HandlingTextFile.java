import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File Creation
    /* File file=new File("/Users/pujakumari/Documents/FileHandling/Newfile.xlsx");
     file.createNewFile();*/
		//How to write data in text file
		/*FileWriter filewritter=new FileWriter("/Users/pujakumari/Documents/FileHandling/Newfile.txt",true);
		BufferedWriter bufferwritterobj=new BufferedWriter(filewritter);
		bufferwritterobj.write("Sree");
		bufferwritterobj.newLine();
		bufferwritterobj.write("Babu");
		bufferwritterobj.newLine(); 
		bufferwritterobj.write("Bhavna");
		bufferwritterobj.close();
		*/
		//How to read data from file and print on console
		
		FileReader filereader=new FileReader("/Users/pujakumari/Documents/FileHandling/Newfile.txt");
		BufferedReader bufferedreaderobj=new BufferedReader(filereader);
		//System.out.println(bufferedreaderobj.readLine());
	//	System.out.println(bufferedreaderobj.readLine());
	/*int size=bufferedreaderobj.readLine().length();
	System.out.println(size);
		for(int i=0;i<size;i++){
			System.out.println(bufferedreaderobj.readLine());
		}*/
		String x="";
		while((x=bufferedreaderobj.readLine())!=null){
			System.out.println(x);
		}
	}
		

}
