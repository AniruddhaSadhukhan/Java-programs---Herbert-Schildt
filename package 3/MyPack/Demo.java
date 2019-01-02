
//Program to understand package
//		by Aniruddha

import p1.*;
import p2.*;

public class Demo
{
	public static void main(String args[])
	{	
		p1.Protection ob1 = new p1.Protection();
		
		//p1.Derived ob2 = new p1.Derived(); 
		//Derived is not public in p1; cannot be accessed from outside package
		
		//p1.SamePackage ob3 = new p1.SamePackage();
		//SamePackage is not public in p1; cannot be accessed from outside package
		
		//p2.Protection2 ob4 = new p2.Protection2();
		//Protection2 is not public in p2; cannot be accessed from outside package
		
		//p2.OtherPackage ob5 = new p2.OtherPackage();
		//OtherPackage is not public in p2; cannot be accessed from outside package
	}
}

/*Output
Base Constructor
n = 1
n_pri = 2
n_pro = 3
n_pub = 4
*/
