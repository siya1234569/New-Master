package inheritance;

public class Son extends Grandfather{

	public static void main(String[] args) {
      Son s=new Son();
		s.city();
		s.country();
		System.out.println(s.i);
	}
	
	public void activities()
	{
		System.out.println("son plays cricket");
	}
	
	

}
