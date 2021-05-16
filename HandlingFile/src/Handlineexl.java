
public class Handlineexl {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//How to read data from excel
		Xls_Reader xlsread=new Xls_Reader("/Users/pujakumari/Documents/workspace/HandlingFile/src/Test.xlsx");
		System.out.println(xlsread.getRowCount("Login Credit"));
		System.out.println(xlsread.getColumnCount("Login Credit"));
		System.out.println(xlsread.getCellData("Login Credit", 1, 3));
		
		//How to write data in excel
		xlsread.setCellData("Login Credit", "Location", 3, "Bangalore");
		
	}

}
