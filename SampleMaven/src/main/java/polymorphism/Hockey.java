package polymorphism;

public class Hockey extends Game{
	public void play(){
		System.out.println("Hockey");
	}

	public static void main(String[] args) {
		Game obj1;   //obj1 is reference of parant for upcasting different children
		obj1=new Hockey();
		obj1.play();
		obj1=new Football();
		obj1.play();
		obj1=new Cricket();
		obj1.play();
		obj1=new Game();
		obj1.play();

	}

}
