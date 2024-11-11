public class CheckAnagram {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		String s1 = input.next();
		String s2 = input.next();

		if (isAnagram(s1, s2)) 
			System.out.print("anagram");
		else
			System.out.print("not anagram");
	}

	public static boolean isAnagram(String s1, String s2) {
        if (s1.equals(s2))
        	return false;
        else if (s1.length() != s2.length())
        	return false;
        else {
        	int[] countOfS1 = new int[26];
        	int[] countOfS2 = new int[26];

            for (int i = 0; i < s1.length(); i++) {
            	countOfS1[s1.charAt(i) - 'a']++;
            }
            for (int j = 0; j < s2.length(); j++) {
            	countOfS2[s2.charAt(j) - 'a']++;
            }

            for (int k = 0; k < 26; k++) {
            	if (countOfS1[k] != countOfS2[k]) {
            		return false;
            	}
            }
        } 

        return true;
	}
}