package inheritance;

public class Developer extends Employee {  //developer is child class
	public void printtext() {
		System.out.println("Developer");
	}

	public static void main(String[] args) {   //main() and obj in child class
		Developer obj=new Developer();
		obj.printtext();
		obj.printit();
	    System.out.print(obj.a);
	}

}
