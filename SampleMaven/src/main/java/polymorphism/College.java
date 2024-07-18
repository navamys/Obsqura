package polymorphism;

public class College extends School {
	public void study() { //overriding study method same
		super.study();
		System.out.println("College students");
	}

	public static void main(String[] args) {
		//College obj=new College();
		School obj=new College();  //upcasting
		obj.study();

	}

}
