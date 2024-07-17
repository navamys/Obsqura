package superkeyword;

public class SuperParent {
	int a=200;
	public void parentmethod(){
		System.out.println("Super method");
	}
	public void display() {
		System.out.println("parent display");
	}
	public SuperParent(int num1,int num2){
		int sum=num1+num2;
		System.out.println("parent sum"+sum);
		System.out.println("Super parent constructor");
		
	}
	

}
