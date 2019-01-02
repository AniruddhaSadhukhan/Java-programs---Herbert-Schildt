
//Program to catch Multiple Exception in Single Catch block
//		by Aniruddha

class Multiple_Exception_Single_Catch
{
	public static void main(String args[])
	{	
		try
		{
			int l = args.length;
			System.out.println("args.length = "+ l);
			int b = 10/l ;
			
			int c[] = {1};
			c[10] = 100;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
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
//case (2): Argument passed in command line
args.length = 1
Exception : java.lang.ArrayIndexOutOfBoundsException: 10
After Try Catch block

*/
