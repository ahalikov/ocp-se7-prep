/**
 *
 * The access level CAN'T be more restrictive than that of the overridden method.
 *
 * The access level CAN be less restrictive than that of the overridden method.
*/
public class AccessScopes {
	public static void main(String[] args) throws Exception {
		Animal animal = new Dog();
		animal.doSomething();

		System.out.println();		
		(new Dog()).doSomething();
	}
}

class Animal {
	Animal() {
		System.out.println("Creating Animal");
	}

	// will be accessible within the same package
	protected void doSomething() throws AnimalException {
		System.out.println("Animal: doSomething()");
	}
}

class Dog extends Animal {

	Dog() {
		System.out.println("Creating Dog");
	}
	
    // Making less restrictive access for subclass
    // May not throw exceptions declared in overriden method
    // Can not throw exceptions broader than in overriden method 
    // public void doSomething() throw Exception { // compiler error
	public void doSomething() throws AnimalException {
		super.doSomething();	
		System.out.println("Dog: doSomething()");
	}
}

class AnimalException extends Exception {}
class DogException extends AnimalException {}