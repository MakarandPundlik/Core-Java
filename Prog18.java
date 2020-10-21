//an examlpe on jagged array
//example on 2*2 display of a matrix
class Prog18
{
	public static void main(String[] args)
	{
		int[][] sal = new int[3][]; //number of colums are not compulsory
		sal[0]=new int[2];
		sal[1]=new int[5];
		sal[2]=new int[3];
		
		int key=10,i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<sal[i].length;j++)
			{
				sal[i][j]=key;
				key+=10;
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<sal[i].length;j++)
			{
				System.out.print(sal[i][j]+"\t");
			}
			System.out.println();
		}
	}
}