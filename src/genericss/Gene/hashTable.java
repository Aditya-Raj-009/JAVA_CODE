package Gene;

import java.util.*;;

public class hashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> hmap=new Hashtable<Integer,String>();
		
		hmap.put(10, "A");
		hmap.put(20, "B");
		hmap.put(5, "C");
		hmap.put(10, "D");
		hmap.put(30, "A");
		hmap.put(40, null);
		hmap.put(50, null);
		hmap.put(10, "A");
		System.out.println(hmap);
		//do not take null value
		


	}

}
