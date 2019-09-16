import java.io.*;
import java.util.*;

public class DeleteString {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println(
				"Usage: java DeleteString John filename");
			System.exit(0);
		}

		File file = new File(args[1]);
        if (!file.exists()) {
        	System.out.println("File " + args[1] + " does not exist");
			System.exit(0);
        }

        Scanner input = new Scanner(file);
        StringBuilder buffer = new StringBuilder();
        while (input.hasNext()) {
        	String s = input.nextLine();
        	String s1 = s.replaceAll(args[0], "");
        	buffer.append(s1);
        }

        input.close();
		PrintWriter output = new PrintWriter(file);
		output.print(buffer.toString());
		
		output.close();    
	}
}