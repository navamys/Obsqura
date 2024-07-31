package interfacepackage;
import java.util.Scanner;
public class Hdfc implements Rbi {
	public void recurringdeposit(int amount,int year) {
		int totalamount=amount*(1+INTEREST_RATE)*year;
		System.out.println("Total amount received will be: "+totalamount);
	}

	public static void main(String[] args) {
		System.out.println("Enter number of years");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		Hdfc obj=new Hdfc();
		obj.recurringdeposit(amount,year);

	}

}
