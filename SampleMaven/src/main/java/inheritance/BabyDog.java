package inheritance;

public class BabyDog extends Dog {
	public void cry() {
		System.out.println("Babydog cries");
	}

	public static void main(String[] args) {
		BabyDog obj1=new BabyDog();
		obj1.cry();
		obj1.eat();
		obj1.bark();
		System.out.println(obj1.animal);
		System.out.println(obj1.dog);

	}

}
