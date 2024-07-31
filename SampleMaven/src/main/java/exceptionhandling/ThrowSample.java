package exceptionhandling;

public class ThrowSample {
	public static void check(int a,int b) {
		int sum=a+b;
		if(sum>50) {
			throw new ArithmeticException("Sum is greater than 50 ");
		}
		else {
			System.out.println("Sum is less than 50");
		}
		
	}

	public static void main(String[] args) {
		/*try {
			check(50,40);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}*/
		check(40,60);
		System.out.println("Rest of the code");

	}

}
