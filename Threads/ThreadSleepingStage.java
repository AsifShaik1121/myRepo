package Threads;

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<=100000;i++) {
			
			System.out.println(i*2);
			
			try {
				// 
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
public class ThreadSleepingStage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		
		t.start();
		
		try {
			//here the main thread will go to sleep 
			t.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
