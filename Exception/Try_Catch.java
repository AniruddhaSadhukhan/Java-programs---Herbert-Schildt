
//Program to understand try & catch
//		by Aniruddha

class Try_Catch
{
	public static void main(String args[])
	{	
		try
		{
			int d = 0 , a = 10/d ;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : " +e);	
		}
	
		System.out.println("After Try Catch block");	
	}
}

/*Sample Output
Exception : java.lang.ArithmeticException: / by zero
After Try Catch block

*/
