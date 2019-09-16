import javax.swing.JOptionPane;

public class InterestCalUsingInputDialog {
	public static void main(String[] args) {
		String balanceString = JOptionPane.showInputDialog(
			"Enter balance: ");
		int balance = Integer.parseInt(balanceString);
		String rateString = JOptionPane.showInputDialog(
			"Enter interest rate: ");
		double rate = Double.parseDouble(rateString);
        String output = "The interest is " + (int)(balance * (rate / 1200) * 100000) / 100000.0;
        JOptionPane.showMessageDialog(null, output);
	}
}