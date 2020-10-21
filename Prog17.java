//example on 2*2 display of a matrix
class Prog17
{
	public static void main(String[] args)
	{
		int[][] a = {{10,20},{30,40}},b={{50,60},{70,80}};
		
		int[][] t= new int[2][2];
		int r,c;
		
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				t[r][c]=a[r][c]+b[r][c];
			}
		}
		
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print(t[r][c]+"\t");
			}
			System.out.println();
		}
	}
}