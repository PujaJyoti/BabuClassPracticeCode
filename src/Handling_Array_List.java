import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class Handling_Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array List is a inbuilt class in java
		// It implement list
		// Using array list we can store multiple values in one object
		// Dynamically
		/*
		 * In Java Integer-{byte,short,int,long} Float-{float,double}
		 * Character-{char} Boolean-{boolean} String Array-
		 */
		/*ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(5);
		b.add(12);
		b.add(1);*/
		ArrayList<Integer> a = new ArrayList<Integer>();
		//LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(4);
		a.add(40);
		a.add(60);
		a.add(60);
		Collections.sort(a,Collections.reverseOrder());
		//a.remove(2);
	//	a.addAll(b);
		/*System.out.println(a.size());
		System.out.println(a.get(3));
		/*
		 * for (int i = 0; i < a.size(); i++) { System.out.println(a.get(i)); }
		 */
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
