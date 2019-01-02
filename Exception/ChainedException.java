
//Program to explain Chained Exception
//		by Aniruddha

class ChainedException
{
	static void subroutine()
	{
		NullPointerException e = new NullPointerException("DemoException");
		e.initCause(new ArithmeticException("CauseDemo"));
		throw e;
	}
	
	public static void main(String args[])
	{	
		try 
		{
			subroutine();
		}	
		catch(Exception e)
		{
			System.out.println("Exception: " +e);
			System.out.println("Original Cause: " +e.getCause());
			
		}
		
	}
}

/*Sample Output
Exception: java.lang.NullPointerException: DemoException
Original Cause: java.lang.ArithmeticException: CauseDemo
*/
