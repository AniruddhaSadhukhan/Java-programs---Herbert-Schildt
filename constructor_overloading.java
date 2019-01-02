
//Program to understand constructor overloading and using objects as parameters
//		by Aniruddha

class Box
{
	double breadth,width,depth;
	
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

class constructor_overloading
{
	public static void main(String args[])
	{	
		Box myBox1 = new Box(10,20,15);
		Box myBox2 = new Box();
		Box cube = new Box(10);
		Box myClone = new Box(myBox1);
		
		System.out.println("Volume of 1st Box           = " + myBox1.volume());
		System.out.println("Volume of uninitialised Box = " + myBox2.volume());
		System.out.println("Volume of Cube              = " + cube.volume());
		System.out.println("Volume of Clone             = " + myClone.volume());
		
	}
}

/*Sample Output
Volume of 1st Box           = 3000.0
Volume of uninitialised Box = -1.0
Volume of Cube              = 1000.0
Volume of Clone             = 3000.0
*/
