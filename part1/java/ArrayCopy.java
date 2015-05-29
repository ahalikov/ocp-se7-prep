public class ArrayCopy {
	public static void main(String[] args) {
		int[] scores = {1, 2, 3, 4, 5, 6};
		System.arraycopy(scores, 2, scores, 3, 2);
		for (int i: scores)
			System.out.print(i + " ");

		System.out.println();
	}
}