class Strings {
	public static void main(String[] args) {

		// printing null
		System.out.println("On next line should be null:");
		String str = null;
		System.out.println(str);

		// Below will throw error: reference to println is ambiguous
		// System.out.println(null);
		
		testReplace();

		testTrim();

		testSubstring();

		testImmutable();
	}

	static void testSubstring() {
		System.out.println("==== Substring ====");
		
		//          0123456
		String s = "minimum";

		// substring(beginIndex)
		System.out.println(s.substring(4)); // mum
		
		// substring(beginIndex, endIndex) - beginIndex included, endIndex - not included 
		System.out.println(s.substring(1, 4)); // ini
	}

	static void testReplace() {
		System.out.println("==== Replace ====");

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
		System.out.println("==== Trim ====");

		String blank = " ";
		String line = blank + "hello" + blank + blank;
		line.concat("world"); // tricky! remember that String is immutable !
		String newLIne = line.trim();
		System.out.println(line.length() + newLIne.length()); // --> 13 !
	}

	static void testImmutable() {
		System.out.println("==== Immutability ====");
		String s = "space explorations";
		tryChange(s);
		System.out.println(s);
	}

	static void tryChange(String str) {
		str = "no money, no funny";
	}
}