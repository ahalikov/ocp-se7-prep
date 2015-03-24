class Literals {

	public static void main(String[] args) {
		
		// Java 7 feature: underscores
		int a = 1_000_000;
		System.out.println("One million: " + a);

		binary();
		octals();
		hex();
	}

	static void binary() {
		System.out.println("Binary numbers");
		
		int b1 = 0B101010;
		int b2 = 0b10001;

		System.out.println("b1 = " + b1 + ", b2 = " + b2);
	}

	static void octals() {
		System.out.println("Octal numbers");

		int six = 06; // decimal 6
		int seven = 07; // decimal 7
		int eight = 010; // decimal 8
		int nine = 011; // decimal 9

		System.out.println("Octal 010 = " + eight);
	} 

	static void hex() {
		System.out.println("Hexadecimal numbers");

		int x = 0X0001;
		int y = 0x7fffffff;
		int z = 0xDeadCafe;

		System.out.println("x = " + x + ", y = " + y + ", z = " + z);	
	}
}