package polymorphism;
import java.util.Scanner;

public class Onseason extends Offseason{
	static int amount;
	static int option;
	
	public void discount(int price) {
		float discount=0.4f*price;
		System.out.println("on season discount  "+discount );
	}
	
	public static void main(String[] args) {
		System.out.println("enter 1 for onseason, enter 2 for off seaon");
		Scanner sc=new Scanner(System.in);
		option=sc.nextInt();
		System.out.println("enter amount");
		amount=sc.nextInt();
		
		switch(option){
			case 1:
				Onseason obj1=new Onseason();
				obj1.discount(amount);
				break;
			case 2:
				Offseason obj2=new Offseason();
				obj2.discount(amount);
				break;				
		}
	}

}
