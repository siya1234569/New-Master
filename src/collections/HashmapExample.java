package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		HashMap<Integer, String> hm=new HashMap<Integer, String>();//it takes two value pair key and value
		hm.put(0, "hello");
		hm.put(1, "goodbye");
		hm.put(32, "morning");
		hm.put(8, "evening");
		System.out.println(hm.get(4));//prints null if there is no key present
		hm.remove(32);
		System.out.println(hm);
		System.out.println(hm.get(32));
		Set<Entry<Integer, String>> s=hm.entrySet();
		Iterator<Entry<Integer, String>> it=s.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());//from this we cannot get key and value separated
			Map.Entry mp=(Map.Entry)it.next();/*this is for separating key and value*///used Map
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
