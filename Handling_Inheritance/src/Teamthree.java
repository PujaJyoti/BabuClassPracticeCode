
public class Teamthree extends Teamone  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teamthree obj=new Teamthree();
		obj.connectdb();
		obj.dologin();
		obj.generatereports();
		obj.homescreen();
	}
public void homescreen(){
	System.out.println("User view Homescreen");
}

}
