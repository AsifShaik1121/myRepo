package enums;


public class TrafficLightManagement {
	
	enum Signals{
		RED,YELLOW,GREEN
	}

	public static void main(String[] args) {
	
	//no of cycles to iterate
	int signalCycle = 5;
	
	for(int cycle=1;cycle<=signalCycle;cycle++) {
		
		System.out.println("cycle : " +cycle);
		
		Signals currentState = Signals.RED;
		displaystate(currentState);
		sleep(3000);
		
		 currentState = Signals.YELLOW;
		displaystate(currentState);
		sleep(3000);
		
		 currentState = Signals.GREEN;
			displaystate(currentState);
			sleep(3000);	
		
	}

}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void displaystate(Signals currentState) {
		// TODO Auto-generated method stub
		
		System.out.println("current state of signal is : "+ currentState);
		
	}
	
}
