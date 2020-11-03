//an eg on final method
class A
{
	final void meth()
	{
		System.out.println("A's implementation of meth()");
	}	
}
class B extends A
{
	void meth()
	{
		/*meth() in B cannot override meth() in A
        void meth()
             ^
		overridden method is final*/
		System.out.println("A's implementation of meth()");
	}
}