
//Program to understand command line arguments
//		by Aniruddha

class command_line_arguments
{
	public static void main(String args[])
	{	
		for(int i=0;i<args.length;i++)
			System.out.println("args["+i+"] = "+args[i]);	
	}
}

/*Try executing the program as shown:
	
	java command_line_arguments this is a test 100 -1
	
*/
	

/*Sample Output
args[0] = this
args[1] = is
args[2] = a
args[3] = test
args[4] = 100
args[5] = -1

*/
