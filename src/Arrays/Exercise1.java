/*2 4 5
 *3 4 7
 *1 2 9 
 */
//print minimum number from above matrix
package Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
	int min=a[0][0];//i.e 2

   for(int i=0;i<3;i++)
   {
	   for(int j=0;j<3;j++)
	   {
		   
			  if(a[i][j]<min)
					  {
				         min =a[i][j];//swap
					  }
		   }
		 
		  
	   }
   System.out.println(min);
   }
	}


