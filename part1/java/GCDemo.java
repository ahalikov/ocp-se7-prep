class GCDemo {
	public static void main(String[] args) {
		String s = "hello ";
		while (true) {
			s += String.valueOf((int) (Math.random()*10));
		}
	}
}