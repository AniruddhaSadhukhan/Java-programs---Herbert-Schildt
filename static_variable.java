import java.io.*;

//Program to show static variables
//		by Aniruddha

class sw
{
	int a;
	static int b;
	
	sw()
	{
		a++;
		b++;
	}
	
	public void inc()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}



class static_variable
{
	public static void main(String args[])
	{	
		sw s = new sw();
		s.inc();
		sw s1 = new sw();
		s1.inc();
	}
}

/*Sample Output
a = 1
b = 1
a = 1
b = 2
*/
