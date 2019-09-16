public class CapitalLetter {
    public static void main(String[] args) {
	    char letter = (char)(System.currentTimeMillis() % 100 % 26 + 65);

		System.out.print(letter);	   
	}
}	