
//Program to understand Default Exception Handler of JVM
//		by Aniruddha

class DefaultException
{
	public static void main(String args[])
	{	
		int  d = 0;	
		int a = 10 / d;
		//here JVM automatically handle exception
	}
}

/*Sample Output
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at DefaultException.main(DefaultException.java:10)

*/
