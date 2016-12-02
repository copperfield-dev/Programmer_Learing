public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);

		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
		System.out.println("Date: " + account.getDateCreated());
	}
}