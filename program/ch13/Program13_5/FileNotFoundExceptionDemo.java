import java.util.Scanner;
import java.io.*;

public class FileNotFoundExceptionDemo {
	public static void main(String[] args) {
		Scanner inputFromConsole = new Scanner(System.in);

		System.out.print("Enter a file name: ");
		String filename = inputFromConsole.nextLine();

		try {
			Scanner inputFromFile = new Scanner(new File(filename));
			System.out.println("File " + filename + " exists ");
		}
		catch (FileNotFoundException ex) {
			System.out.println("Exception?: " + filename + " not found");
		}
	}
}