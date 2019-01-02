
//Program to understand method overriding & overloading
//		by Aniruddha

class A
{
	int i,j;
	
	A(int a,int b)
	{
		i = a;
		j = b;
	}
	
	void show()
	{
		System.out.println("Inside A:\ni : "+i+"\n"+"j : "+j);	
	}
}

class B extends A
{
	int k;
	
	B(int a,int b,int c)
	{
		super(a,b);
		k = c;
	}
	
	void show()	//this overrides show() in A
	{
		System.out.println("Inside B:\nk: "+k);
	}
}

class C extends A
{
	int k;
	
	C(int a,int b,int c)
	{
		super(a,b);
		k = c;
	}
	
	void show()	
	{
		super.show(); 	//calls A's show()
		System.out.println("Inside B:\nk: "+k);
	}
}

class D extends A
{
	int k;
	
	D(int a,int b,int c)
	{
		super(a,b);
		k = c;
	}
	
	void show(String msg)	//overload show()
	{
		System.out.println("Inside D:\nmsg : "+msg+"\nk: "+k);
	}
}

class method_overriding_overloading
{
	public static void main(String args[])
	{	
		B ob1 = new B(1,2,3);
		C ob2 = new C(1,2,3);
		D ob3 = new D(1,2,3);
		
		System.out.println("Calling ob1.show():");
		ob1.show();	//calls show in B
		System.out.println("\nCalling ob2.show():");
		ob2.show();
		System.out.println("\nCalling ob3.show():");
		ob3.show();
		System.out.println("\nCalling ob3.show(\"Hi\"):");
		ob3.show("Hi");
	}
}

/*Sample Output
Calling ob1.show():
Inside B:
k: 3

Calling ob2.show():
Inside A:
i : 1
j : 2
Inside B:
k: 3

Calling ob3.show():
Inside A:
i : 1
j : 2

Calling ob3.show("Hi"):
Inside D:
msg : Hi
k: 3

*/
