package banking;

public class Account {
	
	private long balance;
	private String holderName;
	
	public Account(long balance, String holderName) {
		this.balance = balance;
		this.holderName = holderName;
	}
	
	private final void transaction(String message, long amount) {
		System.out.printf("For user: %s, %s with transaction amount: %d\n", this.holderName, message, amount);
		this.balance += amount;
	}
}
