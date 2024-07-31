package abstraction;
import java.util.Scanner;

public class Contractor extends Employee{
	public void calculateSalary(int hour,int pay){
		int salary=hour*pay;
		System.out.println("Contractor salary is: "+salary);	
	}

	public static void main(String[] args) {
		System.out.println("Enter working hours for contractor");
		Scanner sc=new Scanner(System.in);
		int workhour=sc.nextInt();
		System.out.println("Enter payment per hour");
		int pay=sc.nextInt();
		
		Contractor obj1=new Contractor();
		obj1.calculateSalary(workhour,pay);
		FulltimeEmployee obj2=new FulltimeEmployee();
		obj2.calculateSalary(8,pay);
		
		

	}

}
