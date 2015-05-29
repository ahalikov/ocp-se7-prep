class Casting {
	public static void main(String[] args) {
		int x = (int) 3957.229;
		System.out.println("int x = " + x);

		//long l = 56L;

		// the bits to the left of the lower 8 just go away 
		// and we get seemingly strange result: -126
		long l = 130L;
		byte b = (byte) l;
		
		System.out.println("byte b = " + b);

		float f = 234.56F;
		short s = (short) f;
		System.out.println("short s = " + s);

		// won't compile as byte can only hold up to 127
		// byte a = 130;
		// it can be fixed by explicit casting:
		byte a = (byte) 130;
		System.out.println("byte a = " + a);

		// ok
		byte c = -128; // -129 won't compile
	}
}