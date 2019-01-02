
//Program to understand public & private access control
//		by Aniruddha

class Test
{
	int a;			//default access:class member is public 
				//within its own package but can not be 
				//accessed outside its package
				
	public int b;		//public access:class member can be accessed 
				//by any other code
	
	private int c;		//private access:class member can be accessed 
				//by other members of its class
	
	//method to access c
	void setc(int i)
	{
		c = i;
	}
	
	//get value of c
	int getc()
	{
		return c;
	}
}

class public_private_access_control
{
	//main() is preceded by public specifier as is it called by code
	// outside the program i.e. by the Java Run-Time System
	public static void main(String args[])	
	{	
		Test ob = new Test();
		
		//These are OK...a & b maybe accessed directly
		ob.a = 10;
		ob.b = 20;
		
		//This is not OK...It will cause ERROR
		//ob.c = 30;
		
		//c must be accessed through its public methods setc(),getc()
		ob.setc(30);
		
		System.out.println("a = "+ob.a +"\nb = "+ob.b +"\nc = "+ob.getc());
		
	}
}

/*Sample Output
a = 10
b = 20
c = 30
*/
