//some special methods of StringBuffer class 

class Prog79
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Welcome Java");
		System.out.println("initially s contains "+s);
		s.insert(8,"to ");
		System.out.println("after insert() s contains "+s);
		s.setCharAt(8,'T');
		System.out.println("after setChatAt() s contains "+s);
		s.append("Programming");
		System.out.println("After append(), s contains " + s);
		s.reverse();
		System.out.println("after reverse() s contains "+s);
		String s1 = s.toString();
		System.out.println("after toString() s contains "+s+" s1 contains "+s1);
	}
}
