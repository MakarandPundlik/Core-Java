//example of split method to convert String into array of Strings
class Prog73
{
	public static void main(String[] args)
	{
		String name="databyte computer coaching classes";
		String arr[] = name.split(" ");
		//delimeter in space
		System.out.println("Elements of array are :- ");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}
 