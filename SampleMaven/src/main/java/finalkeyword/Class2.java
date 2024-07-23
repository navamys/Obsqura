package finalkeyword;

public class Class2 extends Class1{  //final class parent so no extend possible
	
	public final void printit() {  //final methods cannot override
		super.printit();
		System.out.println("printit method");
	}

	public static void main(String[] args) {
		Class2 obj=new Class2();
		obj.printit();
		

	}

}
