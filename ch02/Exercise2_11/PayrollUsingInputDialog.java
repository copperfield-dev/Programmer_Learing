import javax.swing.JOptionPane;

public class PayrollUsingInputDialog {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(
			"Enter employee's name: ");
		String hoursString = JOptionPane.showInputDialog(
			"Enter number of hours worked in a week: ");
		int hours = Integer.parseInt(hoursString);
		String payrateString = JOptionPane.showInputDialog(
			"Enter hourly pay rate: ");
        double payrate = Double.parseDouble(payrateString);
		String federaltaxrateString = JOptionPane.showInputDialog(
			"Enter federal tax withoutholding rate: ");
		double federaltaxrate = Double.parseDouble(federaltaxrateString);
	    String statetaxrateString = JOptionPane.showInputDialog(
	    	"Enter state tax withoutholding rate: ");
		double statetaxrate = Double.parseDouble(statetaxrateString);
		double federalpay = (int)(payrate * hours * federaltaxrate * 100) / 100.0;
		double statepay = (int)(payrate * hours * statetaxrate * 100) / 100.0;

        String output = ("Employee name: " + name + "\n" + 
        	             "Hours Worked: " + hours + "\n" +
        	             "Pay Rate:  $" + payrate + "\n" +
        	             "Gross Pay:  $" + payrate * hours + "\n" +
        	             "Deductions:\n" + 
        	             "  Federal Withoutholding (" + (double)(federaltaxrate * 100) + "%): " + "$" + federalpay + "\n" +
                         "  State Withoutholding (" + (double)(statetaxrate * 100) + "%): " + "$" + statepay + "\n" +
                         "  Total Deduction: $" + (federalpay + statepay) + "\n" + 
                         "Net Pay: $" + (payrate * hours - federalpay - statepay));
        JOptionPane.showMessageDialog(null, output);
	}
}