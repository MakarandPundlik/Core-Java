//example of indexof method which returns position of character present in the String
class Prog75
{
	public static void main(String[] args)
	{
		String name = "databyte";
		int pos_1a = name.indexOf('a');
		int pos_2a = name.indexOf('a',pos_1a+1); //position of a after 1st a
		System.out.println("Position of 1st 'a' is "+pos_1a);
		System.out.println("Position of 2nd 'a' is "+pos_2a);

		int pos_3a = name.indexOf('a',pos_2a+1);
		System.out.println("Position of 3rd 'a' is "+pos_3a);//-1
		//returns -1 if elements is not present
	}
}
 /*There is an another method called String.valueOf() which also can be used to convert Int to String*/
