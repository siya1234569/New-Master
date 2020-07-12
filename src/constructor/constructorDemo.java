package constructor;

public class constructorDemo {
int y=0;
	public static void main(String[] args) {

		constructorDemo c = new constructorDemo();
		constructorDemo c1 = new constructorDemo(2, 4);
		constructorDemo c2=new constructorDemo("siya");
		A a =new A();
		a.m1();//calling m1
	}

	public constructorDemo()// default constructor..its is not parametarised
	{
		System.out.println("I am constructor");
	}

	public constructorDemo(int a, int b)// parameterised constuctor
	{
		
		System.out.println("I m  2 parametarised constructor");
	}

	public constructorDemo(String s)// parameterised constuctor
	{
		
		System.out.println("I m  one parametarised constructor");
		System.out.println(s);
		
	}
}
class A extends constructorDemo
{
	
	int k=10;
	public void m1()
	{
		System.out.println(this.k);//calling current class instance variable
		System.out.println(super.y);//calling super class instance variable
		
	}
	}
