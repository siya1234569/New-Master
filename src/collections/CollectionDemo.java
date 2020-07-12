package collections;

import java.util.ArrayList;
import java.util.Iterator;

//o/p:2 is repeated 3 times,1 is repeated 2 times,3 is repeated 2 times and 4 is repeated 1 time
//create an empty arraylist
//check if no. is present in arraylist or not
//
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,1,3,2,2,1,4,3};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				count++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" is repeted "+count+" times ");
				//System.out.println(count);
			}
			
			
		}
		
	}
}	


