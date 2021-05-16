package base;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader xlsread=new Xls_Reader("/Users/pujakumari/Documents/workspace/Handling_DataDriven_Framework/src/inputs/TestSuite.xlsx");
		System.out.println(xlsread.getRowCount("suites"));
		System.out.println(xlsread.getColumnCount("suites"));
		System.out.println(xlsread.getCellData("suites", 1, 3));
		String inputtestcase="LoginTestCase";
		for(int rownum=2;rownum<=xlsread.getRowCount("suites");rownum++){
			if(inputtestcase.equals(xlsread.getCellData("suites",0,rownum))){
				if(xlsread.getCellData("suites",2,rownum).equals("Y")){
					System.out.println("Run the test case");
				}
				else{
					System.out.println("Skip the test case");
				}
					
			}
		}
	}

}
