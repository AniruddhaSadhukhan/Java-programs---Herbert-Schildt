
//Program to understand package
//		by Aniruddha

package p2;

class OtherPackage
{
	OtherPackage()
	{
		p1.Protection p = new p1.Protection();
		
		System.out.println("Other Package Constructor");
		
		//System.out.println("n = "+ p.n);		//class,package only
		//System.out.println("n_pri = "+ p.n_pri);	//class only
		//System.out.println("n_pro = "+ p.n_pro);		//class,subclass,package only
		System.out.println("n_pub = "+ p.n_pub);
	}
}

