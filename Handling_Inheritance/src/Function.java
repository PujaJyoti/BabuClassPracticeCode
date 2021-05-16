
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function obj=new Function();
		obj.login();
		obj.login("Puja");
		obj.login("Puja", "Patna@12");
		
	}
//Compile tme Polymorphism-Method loading
	public void login(){
		System.out.println("Login Method without any parameter");
	}
	public void login(String Username){
		System.out.println("Login Method with Username parameter");
	}
	public void login(String Username,String password){
		System.out.println("Login Method with Username & Password parameter");
	}
}
