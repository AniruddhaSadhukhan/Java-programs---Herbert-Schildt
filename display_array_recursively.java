
//Program to display array recursively
//		by Aniruddha

class array
{
	int[] arr;
	
	array(int i)
	{
		arr = new int[i];
	}
	
	//display array recursively
	void printArray(int i)
	{
		if (i==0)
			return;
		else 
			printArray(i-1);
		System.out.println("arr["+(i-1)+"] = " +arr[i-1]);	
	}
}
class display_array_recursively
{
	public static void main(String args[])
	{	
		int  i;
		
		array ob = new array(10);
		
		for (i=0;i<10;i++)
			ob.arr[i] = i;
		
		ob.printArray(10);	
	}
}

/*Sample Output
arr[0] = 0
arr[1] = 1
arr[2] = 2
arr[3] = 3
arr[4] = 4
arr[5] = 5
arr[6] = 6
arr[7] = 7
arr[8] = 8
arr[9] = 9
*/
