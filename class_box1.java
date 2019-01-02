
//Program to understand Classes and methods
//		by Aniruddha

class Box
{
	double breadth,width,depth;
	
	//compute and return volume
	double volume()
	{
		return breadth*width*depth;
	}
}

class class_box1
{
	public static void main(String args[])
	{	
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		
		//assign values to myBox1's instance variables
		myBox1.width = 10;
		myBox1.breadth = 20;
		myBox1.depth = 15;
		
		//assign different values to myBox2's instance variables
		myBox2.width = 3;
		myBox2.breadth = 6;
		myBox2.depth = 9;
		
		//get volume of first box
		System.out.println("Volume of 1st Box = " + myBox1.volume());
		
		//get volume of second box
		System.out.println("Volume of 2nd Box = " + myBox2.volume());
		
	}
}

/*Sample Output
Volume of 1st Box = 3000.0
Volume of 2nd Box = 162.0

*/
