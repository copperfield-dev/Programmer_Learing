import java.util.Scanner;

public class GuessSqrt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
	    int num = input.nextInt();
	    System.out.print("The sqrt of the number is " + guessSqrt(num));
	}

	public static double guessSqrt(int num) {
		double nextGuess;
		double lastGuess = 1;
        nextGuess = (lastGuess + (num / lastGuess)) / 2;
		while(Math.abs(nextGuess - lastGuess) >= 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2;
		}
		return  nextGuess;
	}
}