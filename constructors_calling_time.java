
//Program to understand when constructors are called
//		by Aniruddha

class A
{
	A()
	{
		System.out.println("Inside A's Constructor");	
	}
}

class B extends A
{
	B()
	{
		System.out.println("Inside B's Constructor");	
	}
}

class C extends B
{
	C()
	{
		System.out.println("Inside C's Constructor");	
	}
}


class constructors_calling_time
{
	public static void main(String args[])
	{	
		C ob = new C();
		/*In a Class hierarchy constructors are called in 
		order of derivation, i.e. from superclass to subclass*/
	}
}

/*Sample Output
Inside A's Constructor
Inside B's Constructor
Inside C's Constructor

*/
