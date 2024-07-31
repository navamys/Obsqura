package exceptionhandling;

public class ExceptionSample {

	public static void main(String[] args) {
		int b=10;
		int a=2;
		int arr[]=new int[3];
		
		try {
			arr[7]=10;
			int d=5/0;
		}
		/*catch(ArithmeticException e) {  //e is a random variable no need to declare
			System.out.println("Division by zero is an exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {    //multiple catch scenario
			System.out.println("Array size is 3, exception caused");
		}
		catch(Exception e) {  //here 'exception' is class of hierarchy
			System.out.println("Parent exception");
			System.out.println(e);
		}*/
		
		//note : at a time only one catch executes.
		finally{
		System.out.println("finally always executed");
		}
		System.out.println("rest of the code");
		System.out.println(b);
		System.out.println(a);
	}

}
