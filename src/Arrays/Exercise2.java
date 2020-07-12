/*2 4 5
 *3 0 7
  1 2 9*/
//find minimum number and then find maximum number in that colomn i.e.o/p=4

package Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                          //first find minimum number
		  int a[][]= {{2,4,5},{3,0,7},{1,2,9}};                      //then identify colomn of min num    
			int min=a[0][0];//i.e 2                                //find max num in identified colomn
            int mincolomnNo = 0; 
			
		   for(int i=0;i<3;i++)
		   {
			   for(int j=0;j<3;j++)
			   {
				   
					  if(a[i][j]<min)
							  {
						         min =a[i][j];//swap
						         mincolomnNo=j;
							  }
				 }
			   
		   }//here o/p is zero
		   System.out.println(min);
		   
		   int max=a[0][mincolomnNo];
		   int k=0;
		   while(k<3)
		   {
			   if(a[k][mincolomnNo]>max)
			   {
				   max=a[k][mincolomnNo];
			   }
			   k++;
		   }
		   
		   
		   System.out.println(max);
		   }
	}


