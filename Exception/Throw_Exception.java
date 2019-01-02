
//Program to use throw to raise exception and rethrow the exception
//		by Aniruddha

class Throw_Exception
{
	static void FirstCatch ()
	{
		try
		{
			throw new NullPointerException("DemoException");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception in FirstCatch : " +e);
			throw e;	//rethrow the exception	
		}
	}
	
	public static void main(String args[])
	{	
		try
		{
			FirstCatch();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Recaught Exception : " +e);	
		}
		
		System.out.println("After Try Catch block");	
	}
}

/*Sample Output

Exception in FirstCatch : java.lang.NullPointerException: DemoException
Exception in thread "main" java.lang.NullPointerException: DemoException
	at Throw_Exception.FirstCatch(Throw_Exception.java:11)
	at Throw_Exception.main(Throw_Exception.java:24)

*/
