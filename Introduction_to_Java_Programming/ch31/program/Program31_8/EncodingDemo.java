import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by copperfield on 21/12/2016.
 */
public class EncodingDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        PrintWriter output = new PrintWriter("temp.txt", "GB18030");
        output.print("\u6B22\u8FCE Welcome \u03B1\u03B2\u03B3");
        output.close();
    
        Scanner input = new Scanner(new File("temp.txt"), "GB18030");
        JOptionPane.showMessageDialog(null, input.nextLine());
    }
}
