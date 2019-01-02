
//Program to use final to prevent overriding and inheritance
//		by Aniruddha

class A 
{
	final void func()
	{
		System.out.println("This is a final method");
	}
}

class B extends A 
{
	//Error,cant override final method.Will cause compile time error
	/*
	void func()
	{
		System.out.println("Illegal");	
	}
	*/
}

final class C
{
	//this is a final class ,it cant be inherited
}

/*
class D extends C
{
	//This class is illegal
}
*/

class final_using_inheritance
{
	public static void main(String args[])
	{	
		B ob = new B();
		ob.func();
	}
}

/*Sample Output
This is a final method
*/
