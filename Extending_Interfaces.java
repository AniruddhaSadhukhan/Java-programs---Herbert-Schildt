
//Program to understand how to extend Interfaces
//		by Aniruddha

interface A
{
	void meth1();
	void meth2();
}

interface B extends A
{
	void meth3();
}

class MyClass implements B
{
	public void meth1()
	{
		System.out.println("Implement meth1()");
	}
	
	public void meth2()
	{
		System.out.println("Implement meth2()");
	}
	
	public void meth3()
	{
		System.out.println("Implement meth3()");
	}
	
	public void NonInterfaceMethod()
	{
		System.out.println("Classes that implement interface may also define other members & methods too");
	}
}

class Extending_Interfaces
{
	public static void main(String args[])
	{	
		MyClass ob = new MyClass();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
		ob.NonInterfaceMethod();

	}
}

/*Sample Output
Implement meth1()
Implement meth2()
Implement meth3()
Classes that implement interface may also define other members & methods too

*/
