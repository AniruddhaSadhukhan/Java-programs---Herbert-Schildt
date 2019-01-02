
//Program to understand call by value and reference
//		by Aniruddha

class Test
{
	int a,b; 
	
	Test()
	{}
	
	Test(int i, int j)
	{
		a=i;
		b=j;
	}
	
	void call_by_val(int i, int j)
	{
		i *= 2;
		j /= 2;
	}
	
	void call_by_ref(Test o)
	{
		o.a *= 2;
		o.b /= 2;
	}
}

class call_by_val_ref
{
	public static void main(String args[])
	{	
		int a=10,b=20 ;	
		
		Test ob1 = new Test();
		Test ob2 = new Test(100,50);
		
		System.out.println("a & b before call by value : "+a+" , "+b);	
		ob1.call_by_val(a,b);
		System.out.println("a & b after call by value : "+a+" , "+b);	
		
		System.out.println("ob2.a & ob2.b before call by reference : "+ob2.a+" , "+ob2.b);	
		ob1.call_by_ref(ob2);
		System.out.println("ob2.a & ob2.b after call by reference : "+ob2.a+" , "+ob2.b);
	}
}

/*Sample Output
a & b before call by value : 10 , 20
a & b after call by value : 10 , 20
ob2.a & ob2.b before call by reference : 100 , 50
ob2.a & ob2.b after call by reference : 200 , 25
*/
