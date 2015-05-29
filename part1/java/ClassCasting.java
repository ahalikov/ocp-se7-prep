class Super {}
class Jet extends Super {}

public class ClassCasting {
	public static void main(String[] args) {
		Super s = new Super();
		Jet jet = new Jet();
		s = (Super) jet;
	}
}