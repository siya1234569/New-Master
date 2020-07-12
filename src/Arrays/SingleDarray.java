package Arrays;

public class SingleDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];/*here first memoey allocated according to size then*/
		a[0] = 2;//initialiazation is done
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(".........................");
		
		//here memory allocated dynamicaly...if we deaclred variables step by step memory is allocated
		int b[]= {3,4,5,6,7};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
