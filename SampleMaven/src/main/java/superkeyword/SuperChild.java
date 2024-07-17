package superkeyword;

public class SuperChild extends SuperParent{
	int a=100;
	public SuperChild(int num1,int num2) {
		//super();  //this is implicitly called only need if this is parameterised
		super(2,3);  
		System.out.println("Super child constructor");
		int sum=num1+num2;
		System.out.println("child sum"+sum);
	}
	public void display() {
		super.display();
		System.out.println("child display");
		System.out.println("child variable: "+a);
		System.out.println("parent variable: "+super.a);
	}


	public static void main(String[] args) {
		SuperChild obj=new SuperChild(10,20);
		obj.display();

	}

}
