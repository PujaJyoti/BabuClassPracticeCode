
public class Hdfc implements Bank ,College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc obj = new Hdfc();
		obj.creditamount();
		obj.debitamount();
		obj.deposit();
		obj.savingaccountholdername();
		currentbalenceholdername();
	}

	@Override// @means annotation in java whatever method implementing from interface written 
	public void creditamount() {
		// TODO Auto-generated method stub
		System.out.println("Credit amount credited");

	}

	@Override
	public void debitamount() {
		// TODO Auto-generated method stub
		int debitamount = 1000;
		System.out.println("Debit amount " + debitamount);
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		int deposit = 5000;
		System.out.println("depoist" + deposit);
	}

	@Override
	public void savingaccountholdername() {
		// TODO Auto-generated method stub
		String holdername = "Babu";
		System.out.println("Holdername" + holdername);
	}
public static void currentbalenceholdername(){
	System.out.println("CurrentBalence holder name:Puja");
}

@Override
public void studentsmanage() {
	// TODO Auto-generated method stub
	
}

@Override
public void Exams() {
	// TODO Auto-generated method stub
	
}

@Override
public void arrears() {
	// TODO Auto-generated method stub
	
}
}
