import java.io.*;
import java.util.*;

public class ReplaceText {
	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			System.out.println(
				"Usage: java ReplaceText file oldStr newStr");
			System.exit(0);
		}

		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(0);
		}

		Scanner input = new Scanner(file);
		StringBuilder buffer = new StringBuilder();
		
		while (input.hasNext()) {
			String s = input.nextLine();
            String s1 = s.replaceAll(args[1], args[2]);
		    buffer.append("\r\n" + s1);
		}	

		input.close();
		PrintWriter output = new PrintWriter(file);
		output.print(buffer.toString());
		
		output.close(); 
	}
}