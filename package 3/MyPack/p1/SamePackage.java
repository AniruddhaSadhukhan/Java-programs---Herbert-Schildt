package p1;
//Program to understand package
//		by Aniruddha

//package p1;

class SamePackage
{
	SamePackage()
	{
		Protection p = new Protection();
		
		System.out.println("Same Package Constructor");
		System.out.println("n = "+ p.n);
		//System.out.println("n_pri = "+ p.n_pri);	//class only
		System.out.println("n_pro = "+ p.n_pro);
		System.out.println("n_pub = "+ p.n_pub);
	}
		
}

/*
Only Compile to .class
*/
