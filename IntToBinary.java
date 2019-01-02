import java.io.*;

//Program to convert integer to binary having fixed given length and grouping size
//		by Aniruddha

class IntToBinary
{
	public static StringBuilder IntToBinary(int n,int s,int g)
	{
		StringBuilder s=new StringBuilder();
		for(int i = 1,j=0;i<(1<<s);i=i<<1,j++)
		{
			if(j%g == 0) 
				s = s.append(" ");
			if((n & i)>0) 
				s = s.append(1);
			else
				s = s.append(0);
		}
		return 	s.reverse();
				
	}
	
	public static void main(String args[])
	{	
		int  a = -61;	
		System.out.println(a+" : "+Integer.toBinaryString(a));
		System.out.println(a+" : "+IntToBinary(a,8,4));	
	}
}

/*Sample Output
-61 : 11111111111111111111111111000011
-61 : 1100 0011 

*/
