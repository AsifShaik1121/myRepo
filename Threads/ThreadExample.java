package Threads;

public class ThreadExample extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread val = Thread.currentThread();
		
		val.setName("1st Thread");
		
		System.out.println(val.getName());
		
		Thread t = new Thread();
		
		t.setName("My Own Thread");
		
		
		System.out.println(t.getName());
		/* set your current thread as daemon thread, we can set the state of the thread to daemon before the start of the thread if u try to set the state a
		after thread is started it will give java.lang.IllegalThreadStateException */
		t.setDaemon(true);
		
		t.start();
		
		t.run();
		
		//to check your current thread is user thread or daemon (returns true or false)
		System.out.println(t.isDaemon());
		
	
		
		
		

	}

}
