class StringBuffers {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello world");

		// Ensures that the capacity of the buffer is at least equal to the specified minimum.
		sb.ensureCapacity(10);

		// reverse
		System.out.println(sb.reverse());

		sb = new StringBuffer("Hello world"); // does it have a setter ?

		// setLength
		sb.setLength(2);
		System.out.println(sb.toString()); // --> He

		sb.clear();
	}
}