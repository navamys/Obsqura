package inheritance;

import java.util.Scanner;

public class BasicpayDedBonus {
	int basicpay,ded,bonus;
	
	public void userinput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your basic pay: ");
		basicpay=sc.nextInt();
		System.out.println("Enter your deductions: ");
		ded=sc.nextInt();
		System.out.println("Enter your Bonus: ");
		bonus=sc.nextInt();
		
	}
}