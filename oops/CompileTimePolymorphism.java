package oops;

class MathOperations {
    int mul(int a, int b) {
        return a/b;
    }

    double mul(double a, double b) {
        return a/b;
    }
}


public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		MathOperations opp = new MathOperations();
		
		System.out.println(opp.mul(2.0, 3.0));
		
		System.out.println(opp.mul(2, 3));

	}

}
