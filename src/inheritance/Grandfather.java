package inheritance;

public class Grandfather {

	public static void main(String[] args) {
	Son s=new Son();/* we can also access child properties by making an object of that class without using
	                   extends keyword*/
	s.activities();
		
		}
	
    int i=5;

	public void city()
	{
		System.out.println(" Grandfather stays at hydrabad");
	}
    public void country()
    {
		System.out.println(" Grandfather country is India");

    }
    
}
