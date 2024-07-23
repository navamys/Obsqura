package encapsulation;

public class PersonDemo {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.setAccountnum(546456735);
		System.out.println("Account number is: "+obj.getAccountnum());
		obj.setEmail("abc@gmail.com");
		System.out.println("Email is: "+obj.getEmail());
		obj.setBalance(2000);
		System.out.println("Balance is: "+obj.getBalance());
		

	}

}
