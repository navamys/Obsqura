package exceptionhandling;

public class ThrowsUnchecked {
	public static void unchecked() throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int a=5;
		if(a!=5) {
			throw new ArithmeticException("Arithmetic Exception occurred");
		}
		else {
			throw new ArrayIndexOutOfBoundsException("Array Exception occured");
		}
	}

	public static void main(String[] args) {
		unchecked();   //handling is not mandatory

	}

}
