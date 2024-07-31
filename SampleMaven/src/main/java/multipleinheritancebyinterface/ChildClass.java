package multipleinheritancebyinterface;

public class ChildClass implements ParentInterface1,ParentInterface2 {
	public void display() {
		System.out.println(VALUE);
	}
	public void show() {
		System.out.println(NAME);
	}

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.display();
		obj.show();

	}

}
