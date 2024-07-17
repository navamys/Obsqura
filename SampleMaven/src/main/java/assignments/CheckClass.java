package assignments;

public class CheckClass extends AdditionResultClass {
	public CheckClass() {
		int result=super.additionResult();
		if(result%10==0) 
			System.out.println("Addition result is divisible by 10");
		else
			System.out.println("NOT divisible by 10");	
	}
	
	public static void main(String[] args) {
		CheckClass obj=new CheckClass();

	}

}
