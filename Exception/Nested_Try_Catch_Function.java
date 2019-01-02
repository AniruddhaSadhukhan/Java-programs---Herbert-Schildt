
//Program to explain Nested Try Catch block with Function
//		by Aniruddha

class Nested_Try_Catch_Function
{
	static void nesttry (int l)
	{
		try
			{
				if (l == 1)
					l /= (l-l);
				else if ( l == 2 )
				{
					int c[] = {1};
					c[10] = 100;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception : " +e);	
			}
	}
	
	public static void main(String args[])
	{	
		try
		{
			int l = args.length;
			System.out.println("args.length = "+ l);
			int b = 10/l ;
			
			nesttry(l);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : " +e);	
		}
		
		System.out.println("After Try Catch block");	
	}
}

/*Sample Output
//case (1): No argument passed in command line
args.length = 0
Exception : java.lang.ArithmeticException: / by zero
After Try Catch block

-----------------------------------------------------------
//case (2): 1 Argument passed in command line
args.length = 1
Exception : java.lang.ArithmeticException: / by zero
After Try Catch block

-----------------------------------------------------------
//case (3): 2 Argument passed in command line
args.length = 2
Exception : java.lang.ArrayIndexOutOfBoundsException: 10
After Try Catch block

-----------------------------------------------------------
//case (4): 3 or more Argument passed in command line (No Exception)
args.length = 3
After Try Catch block

*/
