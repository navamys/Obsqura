package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank obj=new Bank();
		int p=obj.getPin();
		System.out.println(obj.setPin(p));

	}

}
