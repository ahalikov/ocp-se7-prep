class StringBuilderDemo {
	public static void main(String[] args) {
		int n = 1_000_000;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append((int) (Math.random()*10));
		}
		System.out.println(sb.toString());
	}
}