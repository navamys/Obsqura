package encapsulation;
import java.util.Scanner;

public class Bank {
	private int pin;

	public int getPin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pin");
		int pin=sc.nextInt();
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
