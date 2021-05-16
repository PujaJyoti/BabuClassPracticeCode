
public class Getter_Setter {
static int x;
static int y;
static int z;
static String name;





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setX(10);
		getX();
		setY(20);
		getY();
		setZ(30);
		getZ();
		setName("Puja");
		getName();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(name);
	}





	public static int getX() {
		return x;
	}





	public static void setX(int x) {
		Getter_Setter.x = x;
	}





	public static int getY() {
		return y;
	}





	public static void setY(int y) {
		Getter_Setter.y = y;
	}





	public static int getZ() {
		return z;
	}





	public static void setZ(int z) {
		Getter_Setter.z = z;
	}





	public static String getName() {
		return name;
	}





	public static void setName(String name) {
		Getter_Setter.name = name;
	}

}
