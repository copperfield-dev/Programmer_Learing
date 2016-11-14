 public class CheckDigits {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int[] counts = count(s);
        for (int i = 0; i < 10; i++) {
        	if (counts[i] != 0)
        		System.out.print(i + " appears " + counts[i] + " times\n");
        }
	}

	public static int[] count(String s) {
		int[] counts = new int[10];
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				counts[s.charAt(i) - '0']++;
		}
		return counts;
	}
}
