class Basics01 {
	
	// Ok
	String s;
	
	// error: incompatible types: char cannot be converted to String
	// String s1 = 'a';
	
	String s2 = this.toString();

	// Note that main method can be declared as final
	
	// But you can not skip public static void and arguments array
	// If to skip "public", the class won't run and'll throw 
	//		- Error: Main method not found in class Basics01
	
	// If to skip "static", the class won't run and'll throw 
	//		- Error: Main method is not static in class Basics01
	
	// If to make return type int, the class won't run and'll thow 
	//		- Error: Main method must return a value of type void in class Basics01
	
	final public static void main(String[] args) {
		Basics01 obj = new Basics01();
		System.out.println(obj.s2); // prints: Basics01@659e0bfd
		
		testAssignments();

		obj.testLocal(3);
	}

	static void testAssignments() {
		// Below is incorrect
		// error: incompatible types: Basics01 cannot be converted to int
		// int a = b = c = 100;

		// Correct
		int b = 0, c = 0;
		int a = b = c = 100;

		// Also correct
		int y, z;
		int x = y = z = 100;

		// Correct
		int m = 100, n, l;

		// Correct
		int r = 10, s = 5, t = 8 + s;
		
		// Illegal: q is assigned before being initialized
		// int o = 0, p = q + 33, q = 4;
	}

	String s1 = "green mile";

	void testLocal(int n) {
		String local; // (1)
		if (n > 0) local = "good"; // (2) this semicolon confused me
		else local = "bad";        // I thought that this else operator would be illegal after ";"
		                           // but it's absolutely OK.  
		
		System.out.println(s1 + " = " + local); // (3)
	} 
}