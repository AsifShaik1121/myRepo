
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@FunctionalInterface
interface AdvancedMathOperation {
    int calculate(int a);

    // Default method to implement 'operate' using 'calculate'
    default int operate(int a, int b) {
        return calculate(a) + calculate(b);
    }
}
public class Sample {
	
	  public static void main(String[] args) {
	       
	        MathOperation add = (a, b) -> a + b;
	        System.out.println("Addition: " + add.operate(5, 3));

	        AdvancedMathOperation multiply = a -> a * 2;
	        System.out.println("Multiplication: " + multiply.calculate(5));
	        System.out.println("Advanced Calculation: " + multiply.operate(5, 3));
	    }
}
