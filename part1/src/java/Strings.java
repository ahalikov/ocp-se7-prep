class Strings {
	public static void main(String[] args) {
		
		testReplace();

		testTrim();
	}

	static void testReplace() {
		// true
		System.out.println("String" == "String");

		// true, since replace() returns the same String object 
		// if both the parameters are same, i.e. if there is no change.
		System.out.println("String".replace('g', 'g') == "String");

		// false, since replace() makes change and creates a new String object
		System.out.println("String".replace('g','G') == "String".replace('g','G'));

		// false, since replace() makes change and creates a new String object
		System.out.println("String".replace('g','G') == "StrinG");

		// true
		System.out.println("String".replace('g','G').equals("StrinG"));
	}

	static void testTrim() {
		String blank = " ";
		String line = blank + "hello" + blank + blank;
		line.concat("world"); // tricky! remember that String is immutable !
		String newLIne = line.trim();
		System.out.println(line.length() + newLIne.length()); // --> 13 !
	}
}