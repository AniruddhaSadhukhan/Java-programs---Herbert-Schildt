
//Program to explain that when we use multiple catch statements, it is important 
//to remember that exception subclasses must be before any of their superclass
//		by Aniruddha

/* This program contains an ERROR */

class Order_of_exception
{
	public static void main(String args[])
	{	
		try
		{
			int d = 0 , a = 10/d ;
		}
		catch(Exception e)
		{
			System.out.println("Exception : " +e);	
		}
		catch(ArithmeticException e)	
		{
			/* This catch is never reached because 
			ArithmeticException is subclass of Exception */
			
			System.out.println("Exception : " +e);	
		}
		
		/*
		Correct Sequence of catch will be:
		
		catch(ArithmeticException e)	
		{
			System.out.println("Exception : " +e);	
		}	
		catch(Exception e)
		{
			System.out.println("Exception : " +e);	
		}
		
		*/
	
		System.out.println("After Try Catch block");	
	}
}

/*Sample Output
Order_of_exception.java:18: error: exception ArithmeticException has already been caught
		catch(ArithmeticException e)
		^
1 error

*/
