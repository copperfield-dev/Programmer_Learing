public class MyindexOf {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		String s1 = input.next();
		String s2 = input.next();

		if (MyindexOf(s1, s2))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

	public static boolean MyindexOf(String s1, String s2) {
		char first = s1.charAt(0);
		int max = s2.length() - s1.length();

		for (int i = 0; i <= max; i++) {
			if (s2.charAt(i) != first) {
				while (++i <= max && s2.charAt(i) != first);
			}

			if (i <= max) {
				int j = i + 1;
				int end = j + s1.length() - 1;
				for (int k = 1; j < end && s1.charAt(k) 
					== s2.charAt(j); j++, k++);
			if (j == end) 
				return true;
			}
		}

		return false;
	}
}