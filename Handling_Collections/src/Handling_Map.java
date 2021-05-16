import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Handling_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Map is also an interface It is also one of the collection component
		 * to store dynamic values Child class of map are:-HashMap,Linked
		 * HashMap,Hash table ,Tree Map
		 * In this store value on the basis of key and value
		 */
		//HashMap<String,String> map=new HashMap<String,String>();
		//LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
		//TreeMap<String,String> map=new TreeMap<String,String>();
		Hashtable<String,String> map=new Hashtable<String,String>();
		map.put("name", "Puja");
		map.put("role", "QA");
		map.put("Address", "Noida");
		map.put("Project", "Construction");
		//map.put("baselocation", null);
		System.out.println(map.get("role"));
		Set s=map.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
