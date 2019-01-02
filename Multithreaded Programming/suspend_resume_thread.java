
//Program to suspend & resume threads
//		by Aniruddha


class NewThread implements Runnable
{
	String name;
	Thread t;
	boolean suspendFlag;
	
	
	NewThread(String ThreadName)
	{
		name = ThreadName;
		t =  new Thread(this,name);
		System.out.println("New Thread : "+t);
		suspendFlag = false;
		t.start();
	}
	
	
	public void run()
	{
		try
		{
			for(int i=15;i>0;i--)
			{
				System.out.println(name + " : " + i);
				Thread.sleep(200);
				synchronized(this)
				{
					while(suspendFlag)
						wait();
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception : "+e);
		}
		
		System.out.println(name + " exiting");		
	}
	
	
	void suspend()
	{
		suspendFlag = true;
	}
	
	
	synchronized void resume()
	{
		suspendFlag = false;
		notify();
	}
}


class suspend_resume_thread
{
	public static void main(String args[])
	{	
		NewThread a = new NewThread("ONE");
		NewThread b = new NewThread("TWO");
		
		
		try
		{
			Thread.sleep(1000);
			a.suspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			a.resume();
			System.out.println("Resuming thread One");
			b.suspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			b.resume();
			System.out.println("Resuming thread Two");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception : "+e);
		}
		
		
		try
		{
			a.t.join();
			b.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception : "+e);
		}
		
		System.out.println("Exiting Main Thread");			
	}
}

/*Sample Output
New Thread : Thread[ONE,5,main]
ONE : 15
New Thread : Thread[TWO,5,main]
TWO : 15
ONE : 14
TWO : 14
ONE : 13
TWO : 13
ONE : 12
TWO : 12
ONE : 11
TWO : 11
Suspending thread One
TWO : 10
TWO : 9
TWO : 8
TWO : 7
TWO : 6
Resuming thread One
ONE : 10
Suspending thread Two
ONE : 9
ONE : 8
ONE : 7
ONE : 6
Resuming thread Two
TWO : 5
ONE : 5
TWO : 4
ONE : 4
TWO : 3
ONE : 3
TWO : 2
ONE : 2
TWO : 1
ONE : 1
ONE exiting
TWO exiting
Exiting Main Thread

*/
