package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {

	HashSet<String> hs=new HashSet<String>();
	hs.add("USA");
	hs.add("UK");
	hs.add("INDIA");
	hs.add("BRAZIL");
	System.out.println(hs);
	hs.add("UK");
	System.out.println(hs);//duplicate are rejected
	hs.remove("UK");
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	
	Iterator<String> i=hs.iterator();
	//System.out.println(i.next());
	while(i.hasNext()) {
	
	System.out.println(i.next());
	  }
	}

}
