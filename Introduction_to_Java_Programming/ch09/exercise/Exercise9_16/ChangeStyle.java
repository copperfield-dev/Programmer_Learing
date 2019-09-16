import java.io.*;
import java.util.*;

public class ChangeStyle {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
            System.out.println(
            	"Usage: java ChangeStyle sourceFile");
			System.exit(0);
		}

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.print("Source file " + args[0] + " does not exist");
			System.exit(0);
		}

		Scanner input = new Scanner(sourceFile);
	    StringBuilder buffer = new StringBuilder();

        while (input.hasNext()) {
        	String s = input.nextLine();
        	String s1 = s.trim();
        	if (s1.charAt(0) == '{') {
                buffer.append(" {");
                if (s1.length() > 1)
                	buffer.append("\r\n" + s.replace('{', ' '));          
        	}
        	else
        		buffer.append("\r\n" + s);
        }

        input.close();

        PrintWriter output = new PrintWriter(sourceFile);
        output.print(buffer.toString());
        output.close();
	}
}