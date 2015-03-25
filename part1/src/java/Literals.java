class Literals {

	public static void main(String[] args) {
		
		// Java 7 feature: underscores
		int a = 1_000_000;
		System.out.println("One million: " + a);

		binary();
		octals();
		hex();
		floatings();
		chars();
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

	static void floatings() {
		double d1 = 12345.67890;
		double d2 = 0.111D; // not required

		// float f1 = 12.1009; // possible lossy conversion from double to float
		
		float f2 = 3.1400040200F; // required	
	}

	static void chars() {
		char a = 0x892;
		char b = 982;
		char c = (char) 70_000;
		char d = (char) -98;
		System.out.println("a=" + a + ", b=" + b + ", c=" + c + "d=" + d);
	
		// error: incompatible types: possible lossy conversion from int to char
		// char e = -29; 
		// char f = 70_000;
	}
}