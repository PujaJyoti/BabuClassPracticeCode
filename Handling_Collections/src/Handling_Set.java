import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Handling_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hash Set allow to store dynamically but not allow duplicate values
		//HashSet<Integer> set=new HashSet<Integer>();
		//LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		TreeSet<Integer> set=new TreeSet<Integer>(Collections.reverseOrder());
		set.add(12);
		set.add(5);
		set.add(10);
		set.add(12);
		set.add(5);
		//System.out.println(set.size());
		Iterator<Integer>it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
