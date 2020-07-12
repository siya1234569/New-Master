package inheritance;

public class Grandson extends Grandfather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Grandson gs=new Grandson();
           gs.city();
           
          /*gs.activities();/*if we declared extends grandfather it will only acquires properties 
                                  * of grandfather not son*/
           Son s=new Son();/*but we can acces methods of son by simply making an object of son*/ 
           s.activities();
	}

}
