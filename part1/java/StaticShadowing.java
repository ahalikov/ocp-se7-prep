public class StaticShadowing {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.makeSound();
		System.out.println(duck.maxSpeed);

		Bird.fly();
		Duck.fly();

		Bird bird = new Duck();
		bird.makeSound();
		bird.fly();
		System.out.println(bird.maxSpeed);
	}
}

class Bird {
	static int maxSpeed = 100;
	int weight = 10;

	static void fly() {
		System.out.println("Bird::fly()");
	}

	// error: method fly() is already defined in class Bird
	//void fly() {
		// ...
	//}

	void makeSound() {
		System.out.println("Bird::makeSound()");
	}
}

class Duck extends Bird {
	static int maxSpeed = 200;
	int weight = 30;

	static void fly() {
		System.out.println("Duck::fly()");
	}

	void makeSound() {
		System.out.println("Quack!");
	} 
}	