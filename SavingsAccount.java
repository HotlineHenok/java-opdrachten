public class SavingsAccount {

	// Proporties of this class...
	private int balance;

	// Constructors of this class...
	public SavingsAccount() {
		balance = 0;
	}
	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}

	// Methods of this class...
	public void greet() {
		System.out.print("Hello user!");
	}
	public int showBalance() {
		return balance;
	}
	public void deposit(int howMuch) {
		if (howMuch < 0)
			System.out.print("The amount needs to be positive!");
		balance = balance + howMuch;
	}
	public void withdraw(int howMuch) {
		if (howMuch < 0)
			System.out.print("The amount needs to be positive!");
		balance = balance - howMuch;
	}


}