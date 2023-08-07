package Threads;

public class TwoThreadsSameName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(()->{
			
			System.out.println("thread 1 is running");
		});
		
		Thread t2 =new Thread(()->{
			
			System.out.println("thread 2 is running");
			
		});
		//  two thread can have same name but the id remains unique 
		t1.setName("My Thread");
		t2.setName("My Thread");
		
		System.out.println(t1.getId());
		
		System.out.println(t1.getName());
		
		System.out.println(t2.getId());
		
		System.out.println(t2.getName());
		
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		
		//default priority of thread is normal =5
		System.out.println(t1.getPriority());
		
		//we can preferred priority of the thread 
		t2.setPriority(8);
		
		System.out.println(t2.getPriority());
		
		

	}

}
