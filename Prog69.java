//eg2 on String class constructor



class Prog69
{
	public static void main(String[] args)
	{
		byte arr[]={65,66,67,68,69,70};
		String s1 = new String(arr);
		String s2 = new String(arr,2,3);
		
		System.out.println("S1 contains "+s1);
		System.out.println("S2 contains "+s2);
			
	}
}