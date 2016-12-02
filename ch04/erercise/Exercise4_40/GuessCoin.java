public class GuessCoin {
    public static void main(String[] args) {
	    int coin;
	    int front = 0;
	    int reverse = 0;
		for (int i = 0; i < 100; i++) {
			coin = (int)(Math.random() * 100) % 2;
            if (coin == 1) front++;
            else reverse++;
		}
	    System.out.print("The front is " + front + " and the reverse is " + reverse);
	}
}	