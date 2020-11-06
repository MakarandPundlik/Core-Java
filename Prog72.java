//to sort the names of students in array
class Prog72
{
	public static void main(String[] args)
	{
		String[] names = {"makarand","samruddhi","kaustubh","pranjal","tanmay","varad","aditya"};
		int i,j;
		System.out.println("Before sorting :-");
		for(i=0;i<names.length;i++)
		System.out.print(names[i]+" ");
		System.out.println();

		for(i=0;i<names.length;i++)
		{
		 	for(j=0;j<names.length;j++)
			{
				if(names[j].compareToIgnoreCase(names[i])>0)
				{
					String temp = names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}

		System.out.println("After sorting :-");
		for(i=0;i<names.length;i++)
		System.out.print(names[i]+"\t");
		System.out.println();
	}
}