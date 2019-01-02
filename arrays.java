import java.io.*;

//Program to understand arrays
//	by Aniruddha

class arrays
{
	static void min(int[] arr)
	{
		int min = arr[0];
		for(int el:arr)
			if(min>el)
				min=el;
		System.out.println("\nMinimum in arr1="+min);	
	}
	
	public static void main(String args[])
	{	
		int[] arr1;  //declaring array variables in preferred way
		int arr2[];  //works but not preffered way, it is adopted in java to accomodate C/C++ users	
		
		arr1 = new int[5]; //creating array & assigning reference
		arr2 = new int[5];
		
		int[] arr3 = new int[5];  //combined form
		
		int[] arr4 = {5,8,6,1,7}; //direct way
		
		arr1[0]=65;arr1[1]=12;arr1[2]=21;arr1[3]=78;arr1[4]=99; //initialisation
		
		//print all array elements
		
		for(int i = 0;i< arr1.length ;i++)
		{
			System.out.print(arr1[i]+" ");  //print instead of println prints in a single line
		}
		System.out.print("\n");
		
		//print all array elements using foreach
		
		for (int el:arr4)
		{
			System.out.print(el + " ");
		}	
		
		//passing array to method
		min(arr1);
		
		//array copy
		char []copyFrom={'m','i','s','u','n','d','e','r','s','t','a','n','d','i','n','g'};
		char []copyTo= new char[10];
		
		/*syntax System.arraycopy(src,src_pos,dest,dest_pos,length);*/
		System.arraycopy(copyFrom,3,copyTo,0,10);
		
		for (char el:copyTo)
		{
			System.out.print(el);
		}
	}
}

/*Sample Output
65 12 21 78 99 
5 8 6 1 7 
Minimum in arr1=12
understand
*/
