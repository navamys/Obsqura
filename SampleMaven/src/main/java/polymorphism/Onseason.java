package polymorphism;
import java.util.Scanner;

public class Onseason extends Offseason{
	int amount;
	static int amt;
	public void discount(int price) {
		super.discount(amt);
		float discount=0.4f*price;
		System.out.println("on season discount  "+discount );
	}
	public int userinput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount of cloth: ");
		amount=sc.nextInt();
		return amount;
	}

	public static void main(String[] args) {
		Onseason obj1=new Onseason();
		amt=obj1.userinput();
		obj1.discount(amt);
		//Offseason obj2=new Offseason();  //this line can also be done instead of super.method
		//obj2.discount(amt);

	}

}
