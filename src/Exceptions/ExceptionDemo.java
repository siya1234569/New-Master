package Exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
      int a=1;
      int b=0;
     try {
      /* int k=a/b;
       System.out.println(k);*/
    	 int w[]=new int[5];
    	 System.out.println(w[7]);
     }
     catch(ArithmeticException ae){
    	 System.out.println("i catched arithmetic exception");

     }
     catch(IndexOutOfBoundsException ie)
     {
    	 System.out.println("i catched IOE exception");

     }
     catch(Exception e)//this catches any type of exception.this is generic
     {
    	 System.out.println("i catched exception");
     }
     
     finally//this block will executed irrespective of exception thrown or not
     {
    	System.out.println("delete cookies"); 
     }
	}

}
