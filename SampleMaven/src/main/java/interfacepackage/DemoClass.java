package interfacepackage;

public class DemoClass implements Demo{    //'class' implements 'interface'
	public void display() {
		System.out.println("Interface");
		System.out.println(VALUE);
		System.out.println(YOUR_NAME);
	}
	public void show() {
		System.out.println("DemoClass's method");
	}

	public static void main(String[] args) {
		DemoClass obj=new DemoClass();  
		obj.display();
		obj.show();

	}

}
