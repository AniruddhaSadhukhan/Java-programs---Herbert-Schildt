
//Program to understand object passing to methods
//		by Aniruddha

class Test
{
	int a,b;
	
	Test(int i, int j)
	{
		a=i;
		b=j;
	}	
	
	//return true if o is equal to the invoking object
	boolean same(Test o)
	{
		if(o.a == a && o.b == b) return true;
		else return false;
	}
}

class object_passing_methods
{
	public static void main(String args[])
	{	
		Test ob1 = new Test(100,50);
		Test ob2 = new Test(100,50);
		Test ob3 = new Test(25,75);
		
		System.out.println("ob1 == ob2 : "+ob1.same(ob2));
		System.out.println("ob1 == ob3 : "+ob1.same(ob3));
	}
}

/*Sample Output
ob1 == ob2 : true
ob1 == ob3 : false

*/
