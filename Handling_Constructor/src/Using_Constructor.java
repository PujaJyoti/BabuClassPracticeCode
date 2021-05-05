public class Using_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car("wrb","black",10000,12345);
		Car hondas = new Car();
		Car honde = new Car("Wrb","blacks");
		System.out.println(honda.prices);
		System.out.println(honda.model);
		System.out.println(honda.color);
		System.out.println(honda.number);
		Car hundai = new Car("i20","blue",1000000,345);
		System.out.println(hundai.model);
		System.out.println(hundai.color);
		System.out.println(hundai.prices);
		System.out.println(hundai.number);
		/*honda.model="Wrb";
		honda.prices=100000;
		honda.color="Black";
		honda.number=1234;
		Car hundai = new Car();
		hundai.model="i20";
		hundai.prices=200000;
		hundai.color="blue";
		hundai.number=2345;
		Car ford = new Car();
		ford.model="xyz";
		ford.prices=300000;
		ford.color="red";
		ford.number=3452;*/
	}

}
