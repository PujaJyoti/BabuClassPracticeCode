
public class Icici implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici obj = new Icici();
		obj.savingaccountholdername();
		obj.deposit();
		obj.debitamount();
		obj.creditamount();

	}

	@Override
	public void creditamount() {
		// TODO Auto-generated method stub
		int creditamount = 100;
		System.out.println("Salary Credit " + creditamount);
	}

	@Override
	public void debitamount() {
		// TODO Auto-generated method stub
		System.out.println("500 Debit amount deducted");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("No deposit in history log");
	}

	@Override
	public void savingaccountholdername() {
		// TODO Auto-generated method stub
		String name = "prity";
		System.out.println("Holdername" + name);
	}

}
