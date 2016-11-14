public class MySplit {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		String s = input.next();
		String regex = input.next();

        String[] string = mysplit(s, regex);
		for (int i = 0; i < string.length; i++) {
			System.out.print(string[i] + "\n");
		}
	}

	public static String[] mysplit(String s, String regex) {
		String[] tokens = s.split(regex); 
    
        String[] newTokens = new String[2 * tokens.length - 1];
        int k = 0;
        int i, j;
        for (i = 0, j = 0; j < s.length(); j++) {
        	for (int p = 0; p < regex.length(); p++) {
        		if (s.charAt(j) == regex.charAt(p)) {
                	newTokens[k++] = s.substring(i, j);
                	newTokens[k++] = s.substring(j, j + 1);
                	i = j + 1; 
                }
        	}
        }

        newTokens[k] = s.substring(i, s.length());

        return newTokens;
	}
}