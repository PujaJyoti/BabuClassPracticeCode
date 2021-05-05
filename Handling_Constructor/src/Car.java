public class Car {
  String model;
  String color;
  int prices;
  int number;
  
  public Car(String m,String c,int p,int n){
	  model=m;
	  color=c;
	  prices=p;
	  number=n;
	  
	//  System.out.println("Default constructor");
  }
  public Car(String m,String c){
	  System.out.println("Parameterized Constructor ");
  }
  
  public Car(){
	  System.out.println("Default Car");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car obj=new Car();
		//System.out.println(obj.model);
		//System.out.println(obj.prices);
		System.out.println("Hello main method executed");
	
	}

}
