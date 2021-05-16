
public class Teamtwo extends Teamone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teamtwo obj=new Teamtwo();
		obj.logout();
		obj.connectdb();
		obj.dologin();
		obj.generatereports();
	}
	public void logout(){
		System.out.println("User logout");
	}
	public void generatereports(){
		System.out.println("Report Generated in Team 2");
	}

}
