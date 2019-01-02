
//Program to use finally block with exception handling
//		by Aniruddha

class finally_exception
{

	/* A() prematurely breaks out of try block by throwing an exception.
	The finally clause is executed on the way out */
	static void A()
	{
		try
		{
			System.out.println("Inside A");
			throw new RuntimeException("DemoException");
		}
		finally
		{
			System.out.println("A's finally executed");	
		}
	}
	
	
	/* B()'s try statement is exited via return,
	The finally clause is executed before B() returns */
	static void B()
	{
		try
		{
			System.out.println("Inside B");
			return;
		}
		finally
		{
			System.out.println("B's finally executed");	
		}
	}
	
	
	/* C()'s try statement is executed normally,without error
	The finally clause is still executed  */
	static void C()
	{
		try
		{
			System.out.println("Inside C");
		}
		finally
		{
			System.out.println("C's finally executed");	
		}
	}
	
	public static void main(String args[])
	{	
		try
		{
			A();
		}	
		catch(Exception e)
		{
			System.out.println("Exception : " +e);	
		}
		B();
		C();
	}
}


/*Sample Output
Inside A
A's finally executed
Exception : java.lang.RuntimeException: DemoException
Inside B
B's finally executed
Inside C
C's finally executed

*/
