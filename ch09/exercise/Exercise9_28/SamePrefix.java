public class SamePrefix {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter two string: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();

		StringBuilder buffer = new StringBuilder();

        int i = 0;
	    while(s1.charAt(i) == s2.charAt(i)) {
            i++;
	    }
	    buffer.append(s1.substring(0, i));
	    System.out.print(buffer.toString());
	}
}