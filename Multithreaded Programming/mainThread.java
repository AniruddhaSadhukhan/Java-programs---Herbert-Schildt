
//Program to control main Thread
//		by Aniruddha

class mainThread
{
	public static void main(String args[])
	{	
		Thread t = Thread.currentThread();
		
		System.out.println("Current thread: " + t);
		
		//change the name of the thread
		t.setName("My Thread");
		System.out.println("After name change : "+ t.getName());
		//or use, Thread.currentThread().getName()
		System.out.println("Thread becomes : "+t);
		System.out.println("Thread priority : "+t.getPriority());
		//or use, Thread.currentThread().getPriority()
		
		try
		{
			for (int i=5;i>0;i--)
			{
				System.out.println(i);
				t.sleep(1000); //or, Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Main Thread Exception");
		}
	}
}

/*Sample Output
Current thread: Thread[main,5,main]
After name change : My Thread
Thread becomes : Thread[My Thread,5,main]
Thread priority : 5
5
4
3
2
1

*/
