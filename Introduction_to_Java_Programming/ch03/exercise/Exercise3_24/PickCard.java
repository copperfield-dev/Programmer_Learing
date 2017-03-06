import java.util.Scanner;
 
public class PickCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1-52: ");
		int yourCard = input.nextInt();

		int color = (yourCard - 1) / 13;
		int digit = (yourCard - 1) % 13;

		System.out.print("The card you picked is ");

		switch (digit) {
			case 0: System.out.print("Ace ");
			        break;
			case 1: System.out.print("2 ");
			        break;
			case 2: System.out.print("3 ");
			        break;
			case 3: System.out.print("4 ");
			        break;
			case 4: System.out.print("5 ");
			        break;
			case 5: System.out.print("6 ");
			        break;
			case 6: System.out.print("7 ");
			        break;
			case 7: System.out.print("8 ");
			        break;
            case 8: System.out.print("9 ");
			        break;
            case 9: System.out.print("10 ");
			        break;
			case 10: System.out.print("Jack ");
			        break;
			case 11: System.out.print("Queen ");
			        break;
			case 12: System.out.print("King ");
			        break;
		}
		System.out.print("of ");
		switch (color) {
			case 0: System.out.print("Clubs");
			        break;
			case 1: System.out.print("Diamond");
			        break;
			case 2: System.out.print("Heart");
			        break;
			case 3: System.out.print("Spades");
			        break;
		}
	}
}