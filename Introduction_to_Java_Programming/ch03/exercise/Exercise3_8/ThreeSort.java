import javax.swing.JOptionPane;

public class ThreeSort {
	public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog(
    	    "Enter the first number: ");
        int num1 = Integer.parseInt(num1String);

        String num2String = JOptionPane.showInputDialog(
    	    "Enter the first number: ");
        int num2 = Integer.parseInt(num2String);

        String num3String = JOptionPane.showInputDialog(
    	    "Enter the first number: ");
        int num3 = Integer.parseInt(num3String);

        int temp;
        if (num1 > num2) {
        	temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 <= num2) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        	if (num2 <= num1) {
        		temp = num1;
                num1 = num2;
                num2 = temp;
        	}
        } 
        System.out.print(num1 + " " + num2 + " " + num3);  
	} 
}