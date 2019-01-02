
//Program to demonstrate thread priorities
//		by Aniruddha


class clicker implements Runnable
{
	long click = 0L;
	Thread t;
	private volatile boolean running = true;
	
	public clicker(int p)
	{
		t = new Thread(this);
		t.setPriority(p);
	}
	
	public void start()
	{
		t.start();
	}
	
	public void run()
	{
		/*as running is volatile, this running is 
		examined each time the loop iterates */
		while(running)	
			{click++;}
			
	}
	
	public void stop()
	{
		running = false;
	}
}

class priority
{
	public static void main(String args[])
	{	
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		clicker high = new clicker(Thread.NORM_PRIORITY+4);
		clicker low  = new clicker(Thread.NORM_PRIORITY-4);
		
		high.start();
		 low.start();
		 
		try
		{
			System.out.print("Please Wait for ");
			for(int i=10;i>0;i--)
			{
				System.out.format("%2d seconds",i);
				Thread.sleep(1000);
				for(int j=0;j<=9;j++)
					System.out.print("\b");
			}
			for(int j=0;j<27;j++)
				System.out.print("\b");
			System.out.println("Thanks for waiting                ");
		} 
		catch(InterruptedException e)
		{
			System.out.println("Main Thread interrupted");	
		}
		
		high.stop();
		 low.stop();
		
		try
		{
			high.t.join();
			 low.t.join();
		}	
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException caught");	
		}
		
		System.out.println("Click count:");
		System.out.println("High Priority Thread :" +high.click);
		System.out.println(" Low Priority Thread :" + low.click);
		
	}
}

/*Sample Output
Thanks for waiting                
Click count:
High Priority Thread :3555553544
 Low Priority Thread :3493405628

*/
