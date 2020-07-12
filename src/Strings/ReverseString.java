//to reverse a string "priyanka" and it is pallindrome or not

package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String S= "naman";
       String t="";
       for(int i=S.length()-1;i>=0;i--)
       {
    	   t=t+S.charAt(i);
       }
       System.out.println(t);
       if(S.contentEquals(t))
       {
    	   System.out.println("given string is pallindrome");
       }
       else {
    	   System.out.println("given string is not pallindrome");
       }
	}

}
