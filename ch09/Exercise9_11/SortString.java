public class SortString {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Please enter a string: ");
		String string = input.next();
		StringBuilder s = new StringBuilder();
		s.append(string);
		quicksort(s, 0, s.length() - 1);
		System.out.print(s.toString());
	}

	public static void quicksort(StringBuilder s, int p, int r) {
        if (p < r) {
        	int q = partition(s, p, r);
        	quicksort(s, p, q - 1);
        	quicksort(s, q + 1, r);
        }
	}

	public static int partition(StringBuilder s, int p, int r) {
		char x = s.charAt(r);
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
        	if (s.charAt(j) <= x) {
        		i = i + 1;
        		char temp = s.charAt(i);
                s.setCharAt(i, s.charAt(j));
       	        s.setCharAt(j, temp);
        	}
        }
        char temp = s.charAt(i + 1);
        s.setCharAt(i + 1, s.charAt(r));
       	s.setCharAt(r, temp);
       	return i + 1;
	}
}