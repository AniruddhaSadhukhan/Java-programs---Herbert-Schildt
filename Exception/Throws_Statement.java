
//Program to use throws clause
//		by Aniruddha

/*
A throws clause lists the types of exceptions that a method might throw.
This is necessary for all exceptions, except those of type
Error or RuntimeException, or any of their subclass  

*/ 
class Throws_Statement
{
	static void ThrowOne () throws IllegalAccessException
	{
		System.out.println("Inside ThrowOne");
		throw new IllegalAccessException("DemoException");	
	}
	
	public static void main(String args[])
	{	
		try
		{
			ThrowOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Exception : " +e);	
		}
		
		System.out.println("After Try Catch block");	
	}
}

/*Sample Output

Inside ThrowOne
Exception : java.lang.IllegalAccessException: DemoException
After Try Catch block

*/
