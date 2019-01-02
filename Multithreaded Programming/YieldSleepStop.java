
//Program to use yield(),sleep(),stop()
//		by Aniruddha

class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				if(i==4)
					yield();
				/*yield() means that the thread is not doing anything 
				particularly important and if any other threads need to be run,
				they should.Otherwise the current thread will continue to run */
				System.out.println("A : "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("A Interrupted");
		}
		System.out.println("Exiting Thread: A");
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				//if(i==2)
					//stop(); //stop() in Thread has been deprecated

				System.out.println("B : "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("B Interrupted");
		}
		System.out.println("Exiting Thread: B");
	}
}

class C extends Thread
{
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				if(i==3)
					sleep(1000);
				System.out.println("C : "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("C Interrupted");
		}
		System.out.println("Exiting Thread: C");
	}
}


class YieldSleepStop
{
	public static void main(String args[])
	{	
		
		new A().start();
		new B().start();
		new C().start();
		
		try
		{
			Thread.sleep(5000); //wait for other threads to end
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
		
	}
}

/*Sample Output
A : 5
A : 4
A : 3
A : 2
A : 1
Exiting Thread: A
B : 5
B : 4
B : 3
B : 2
B : 1
Exiting Thread: B
C : 5
C : 4
C : 3
C : 2
C : 1
Exiting Thread: C
Exiting Main Thread
*/
