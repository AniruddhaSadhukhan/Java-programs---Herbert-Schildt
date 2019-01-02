
//Program to understand method overloading
//		by Aniruddha

class overloadDemo
{
	void test()
	{
		System.out.println("No Parameter");
	}
	
	void test(int a)
	{
		System.out.println("a: "+a);
	}
	
	void test(int a,int b)
	{
		System.out.println("a: "+a+"\nb: "+b);
	}
	double test(double a)
	{
		System.out.println("double a: "+a);
		return a*a;
	}
}

class method_overloading
{
	public static void main(String args[])
	{	
		overloadDemo ob = new overloadDemo();
		
		ob.test();
		ob.test(50,100);
		System.out.println("Result of ob.test(56.645): "+ob.test(56.645));
		ob.test(25);	
	}
}

/*Sample Output
No Parameter
a: 50
b: 100
double a: 56.645
Result of ob.test(56.645): 3208.656025
a: 25

*/
