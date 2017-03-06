public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);

		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
		System.out.println("Date: " + account.getDateCreated());
		System.out.println(account);

		SavingAccount account1 = new SavingAccount();
		System.out.println(account1);
		CheckingAccount account2 = new CheckingAccount();
		System.out.println(account2);
	}
}