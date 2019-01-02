
//Program to show stack trace of Default Handler
//		by Aniruddha

class Stack_Trace_Default_Handler
{
	static void subroutine()
	{
		int d = 0;
		int a = 10/d;
	}
	
	public static void main(String args[])
	{	
		Stack_Trace_Default_Handler.subroutine();
	}
}

/*Sample Output
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Stack_Trace_Default_Handler.subroutine(Stack_Trace_Default_Handler.java:10)
	at Stack_Trace_Default_Handler.main(Stack_Trace_Default_Handler.java:15)

*/
