
//Program to understand DeadLock
//		by Aniruddha


public class DeadLock
{
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	
	public static void main(String args[])
	{	
		NewThread1 T1 = new NewThread1();
		NewThread2 T2 = new NewThread2();
		
		T1.start();
		T2.start();
	}
	
	
	public static class NewThread1 extends Thread
	{
		public void run()
		{
			synchronized(Lock1)
			{
				System.out.println("Thread 1 : Holding Lock 1 ...");
			
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread 1 : Exception :- "+e);
				}
			
				System.out.println("Thread 1 : Waiting for Lock 2 ...");
			
				synchronized(Lock2)
				{
					System.out.println("Thread 1 : Holding Lock 1 & 2 ...");
				}
			}
		}
	}


	public static class NewThread2 extends Thread
	{
		public void run()
		{
			synchronized(Lock2)
			{
				System.out.println("Thread 2 : Holding Lock 2 ...");
			
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					System.out.println("Thread 2 : Exception :- "+e);
				}
			
				System.out.println("Thread 2 : Waiting for Lock 1 ...");
			
				synchronized(Lock2)
				{
					System.out.println("Thread 2 : Holding Lock 1 & 2 ...");
				}
			}
		}
	}
}



/*Sample Output
Thread 1 : Holding Lock 1 ...
Thread 2 : Holding Lock 2 ...
Thread 1 : Waiting for Lock 2 ...
Thread 2 : Waiting for Lock 1 ...
		//1 sec delay due to deadlock
Thread 2 : Holding Lock 1 & 2 ...
Thread 1 : Holding Lock 1 & 2 ...

*/
