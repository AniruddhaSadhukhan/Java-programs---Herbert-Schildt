
//Program to use super to overcome name hiding
//		by Aniruddha

class A
{
	int i;
}

class B extends A
{
	int i;	//this i hides i of A
	
	B(int a,int b)
	{
		super.i=a;	//i in A
		i=b;		//i in B
	}
	
	void show()
	{
		System.out.println("i in superclass : "+super.i);
		System.out.println("i in subclass   : "+i);	
	}
}

class super_to_overcome_name_hiding
{
	public static void main(String args[])
	{	
		B ob = new B(1,2);
		ob.show();
	}
}

/*Sample Output
i in superclass : 1
i in subclass   : 2

*/
