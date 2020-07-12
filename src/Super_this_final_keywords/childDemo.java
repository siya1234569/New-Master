package Super_this_final_keywords;

public class childDemo extends parentDemo {

	// variable
	String s = "qaclickacademy";

	// child method
	public void getstringData() {
		System.out.println(s);// here though child extends parent it will give prefernce to local variable
		System.out.println(super.s);// here super will call parent s variable
	}

	// similar method of child and parent
	public void getData() {
		super.getData();// parent class getdata calls
		System.out.println("I am child class getdata()");
	}

	// child constructor
	public childDemo() {
		super();//calling of parent class constructor//rule=it alwys should be first line
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getstringData();
		cd.getData();// child class getdata calls

	}

}
