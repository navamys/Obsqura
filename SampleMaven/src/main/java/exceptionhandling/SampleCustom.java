package exceptionhandling;

public class SampleCustom {
	public static void check(int age) throws LicenseException {
		if(age<18) {
			throw new LicenseException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		try{
			check(10);
		}
		catch(LicenseException e) {
			System.out.println(e);
		}
	}

}
