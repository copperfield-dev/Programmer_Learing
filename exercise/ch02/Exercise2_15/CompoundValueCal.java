public class CompoundValueCal {
    public static void main(String[] args) {
	int deposit = 100;
        double balance = 0;
        for (int i = 0; i < 6; i++) {
            balance = (int)((deposit + balance) * (1 + 0.00417) * 1000) / 1000.0;
            System.out.println(balance);
        }
    }
}