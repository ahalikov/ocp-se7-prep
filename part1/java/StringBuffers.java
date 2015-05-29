class StringBuffers {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("If music be the food of love, play on.");

		// Ensures that the capacity of the buffer is at least equal to the specified minimum.
		sb.ensureCapacity(10);

		// reverse
		System.out.println(sb.reverse());

		sb = new StringBuffer("Hello world"); // does it have a setter ?

		// setLength
		sb.setLength(2);
		System.out.println(sb.toString()); // --> He

		// No such method!
		//sb.clear();

		// How to clear StringBuffer ?
		sb.delete(0, sb.length());
		System.out.println("sb = " + sb.toString());

		// Append returns modified StringBuffer object
		// so you can make chaining:
		sb
			.append("Love all, trust a few, ")
			.append("do wrong to none.");
		System.out.println(sb);

		// append supports all kind of arguments:
		// boolean, char, char array, char array with start index and offset,
		// double, float, int, long, Object, String, StringBuffer			
	}
}