package Super_this_final_keywords;

public class thisdemo {
	
	 static String s="suraj";
	 int a=8;
	
	public void getData()
	{
		int s=6;
		int a=1;
		int c=a+this.a;
		System.out.println(c);
		System.out.println(s);//this will call local variable int
		System.out.println(this.s);//this will call global variable string
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisdemo td=new thisdemo();//
		td.getData();
		new thisdemo().getData();//we can also create an object like this
		System.out.println(s);
	}

}
