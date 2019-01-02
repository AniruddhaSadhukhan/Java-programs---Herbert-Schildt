
//Program to understand Inheritance
//		by Aniruddha

class Box
{
	private double breadth,width,depth;
	
	//construct clone of a object
	Box(Box ob)
	{
		width = ob.width;
		breadth = ob.breadth;
		depth = ob.depth;
	}
	
	//constructor used when all dimensions are specified
	Box(double b,double w,double d)
	{
		width = w;
		breadth = b;
		depth = d;
	}
	
	//constructor used when no dimensions are specified
	Box()
	{
		width = -1;   //-1 is used to 
		breadth = -1; //initialise an 
		depth = -1;   //uninitialised box
	}
	
	//constructor used when cube is created
	Box(double len)
	{
		width = breadth = depth = len;
	}
	
	//compute and return volume
	double volume()
	{
		return breadth*width*depth;
	}
}

class BoxWeight extends Box
{
	double weight;
	
	/* super() always refers to constructor in closest superclass.
	super() in BoxWeight calls the constructor in Box */
	
	//construct clone of a object
	BoxWeight(BoxWeight ob)
	{
		/* 
		super() is called with an object of type BoxWeight, not of Box
		This stills invokes the constructor Box(Box ob)
		As a superclass variable can be used to 
		reference any object derived from that class,
		we are able to pass a BoxWeight object to the Box constructor.
		Of course,Box has only knowledge of its own members.
		*/
		
		
		super(ob);	
		weight = ob.weight;
	}
	
	//constructor used when all dimensions are specified
	BoxWeight(double b,double w,double d,double m)
	{
		super(b,w,d);
		weight = m;
	}
	
	//constructor used when no dimensions are specified
	BoxWeight()
	{
		super(); 
		weight = -1;  
	}
	
	//constructor used when cube is created
	BoxWeight(double len,double m)
	{
		super(len);
		weight = m;
	}
	
}

class ShippingCost extends BoxWeight
{
	double cost;
	
	/* super() always refers to constructor in closest superclass.
	super() in ShippingCost calls the constructor in BoxWeight */
	
	//construct clone of a object
	ShippingCost(ShippingCost ob)
	{
		super(ob);
		cost = ob.cost;
	}
	
	//constructor used when all dimensions are specified
	ShippingCost(double b,double w,double d,double m,double c)
	{
		super(b,w,d,m);
		cost = c;
	}
	
	//constructor used when no dimensions are specified
	ShippingCost()
	{
		super(); 
		cost = -1;  
	}
	
	//constructor used when cube is created
	ShippingCost(double len,double m,double c)
	{
		super(len,m);
		cost = c;
	}
	
}


class inheritance
{
	public static void main(String args[])
	{	
		ShippingCost myBox1 = new ShippingCost(10,20,15,25,5.25);
		ShippingCost myBox2 = new ShippingCost(2,3,4,10,2.50);
		ShippingCost myBox3 = new ShippingCost();
		ShippingCost myCube = new ShippingCost(5,15,3.75);
		ShippingCost myClone = new ShippingCost(myBox1);
		
		
		System.out.println("\nVolume of 1st Box           = " + myBox1.volume());
		System.out.println("Weight of 1st Box           = " + myBox1.weight);
		System.out.println("Cost of 1st Box             = Rs. " + myBox1.cost);
		
		System.out.println("\nVolume of 2nd Box           = " + myBox2.volume());
		System.out.println("Weight of 2nd Box           = " + myBox2.weight);
		System.out.println("Cost of 2nd Box             = Rs. " + myBox2.cost);
		
		System.out.println("\nVolume of uninitialised Box = " + myBox3.volume());
		System.out.println("Weight of uninitialised Box = " + myBox3.weight);
		System.out.println("Cost of uninitialised Box   = Rs. " + myBox3.cost);
		
		System.out.println("\nVolume of Cube              = " + myCube.volume());
		System.out.println("Weight of Cube              = " + myCube.weight);
		System.out.println("Cost of Cube                = Rs. " + myCube.cost);
		
		System.out.println("\nVolume of Clone             = " + myClone.volume());
		System.out.println("Weight of Clone             = " + myClone.weight);
		System.out.println("Cost of Clone               = Rs. " + myClone.cost);
		
	}
}

/*Sample Output
Volume of 1st Box           = 3000.0
Weight of 1st Box           = 25.0
Cost of 1st Box             = Rs. 5.25

Volume of 2nd Box           = 24.0
Weight of 2nd Box           = 10.0
Cost of 2nd Box             = Rs. 2.5

Volume of uninitialised Box = -1.0
Weight of uninitialised Box = -1.0
Cost of uninitialised Box   = Rs. -1.0

Volume of Cube              = 125.0
Weight of Cube              = 15.0
Cost of Cube                = Rs. 3.75

Volume of Clone             = 3000.0
Weight of Clone             = 25.0
Cost of Clone               = Rs. 5.25

*/
