//to create records of banking applications

package test;
public class Customer
{
	private int cu_id;
	private String name;
	private double bal;
	public Customer(int id,String n,double b)
	{
	 cu_id=id;
	 name=n;
	 bal=b;
	}
	
	public void display()
	{
		if(bal<0)
		System.out.println("Customer id:- "+cu_id+" name:-"+name+" balance:-"+bal);
	}
}