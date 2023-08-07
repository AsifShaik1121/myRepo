package IMP;

public class SingleTon {
	
	private static SingleTon instance;
	
	private SingleTon() {
		
	}
	
	public static synchronized SingleTon getInstance() {
		
		if(instance==null) {
			
			instance = new SingleTon();
		}
		
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTon s1 = SingleTon.getInstance();
		
		SingleTon s2 = SingleTon.getInstance();
		
		System.out.println(s1==s2);
		

	}

}
