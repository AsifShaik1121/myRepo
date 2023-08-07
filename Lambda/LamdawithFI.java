package Lambda;

@FunctionalInterface
interface INF{
	
	public  void m1(int a, int b);
}

public class LamdawithFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		INF i = (a,b)->System.out.println(a+b);
		i.m1(10, 20);
	

	}

}
