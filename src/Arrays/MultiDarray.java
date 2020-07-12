package Arrays;

public class MultiDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 7;
		a[1][1] = 8;
		a[1][2] = 9;
		System.out.println(a[1][0]);
System.out.println(".......................");

for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.println(a[i][j]);
	}
}
System.out.println("......................");

int b[][]= {{3,14},{72,82},{6,7}};
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.println(b[i][j]);
	}
}
	}

}
