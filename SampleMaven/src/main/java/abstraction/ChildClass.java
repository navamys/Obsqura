package abstraction;

public class ChildClass extends ParentClass {
	public void display() {                 //implementation of abstract method of parent
		System.out.println("Abstaction"); 
	}
	public void printit() {                  //non abstract method of child
		System.out.println("usual method of this childclass");
	
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.display();
		obj.show();
		obj.printit();

	}

}
