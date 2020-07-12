package collections;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("hello");
		al.add("priyanka");
		System.out.println(al);
		al.add(1, "how");
		al.add(3, "are");
		al.add(4, "you");
		al.add(0, "hii");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.remove("you");
		System.out.println(al);
		al.clone();
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.contains("are"));
		System.out.println(al.indexOf("priyanka"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
