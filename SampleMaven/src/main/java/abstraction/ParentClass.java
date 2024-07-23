package abstraction;

public abstract class ParentClass {
	public abstract void display();    //abstract method of parent
	public void show() {               //non abstract method of parent
		System.out.println("Non abstract method");
	}

}
